package uz.pdp.task1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.task1.entity.Attachment;
import uz.pdp.task1.payload.Result;
import uz.pdp.task1.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    final AttachmentService attachmentService;

    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @PostMapping
    public Result addAttachment(MultipartHttpServletRequest request) throws IOException {

        return attachmentService.add(request);
    }

    @GetMapping
    public List<Attachment> getAll() {
        return attachmentService.get();
    }

    @GetMapping("/{id}")
    public void getById(@PathVariable Integer id, HttpServletResponse response) throws IOException {

        attachmentService.getById(id, response);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {

        return attachmentService.delete(id);
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, MultipartHttpServletRequest request) throws IOException {

        return attachmentService.update(id, request);
    }
}
