package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.domain.Post;
import hello.domain.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(int id) {
        postRepository.delete(id);
    }

    public List<Post> listPost() {
        return postRepository.findAll();
    }

    public Post findOne(int id) {
        return postRepository.findOne(id);
    }
}
