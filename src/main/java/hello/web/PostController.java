package hello.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.domain.Post;
import hello.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String form(Post post) {
        return "form";
    }

    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String write(Post post) {
        post.setRegDate(new Date());
        return "redirect:/post/" + postService.savePost(post).getId();
    }

    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        postService.deletePost(id);
        return "redirect:/post/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Post> postList = postService.listPost();
        model.addAttribute("postList", postList);

        return "blog";
    }

    @RequestMapping("/{id}")
    public String view(Model model, @PathVariable int id) {
        Post post = postService.findOne(id);
        model.addAttribute("post", post);
        return "post";
    }
}
