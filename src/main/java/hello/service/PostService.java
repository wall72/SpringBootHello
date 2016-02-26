package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hello.domain.Post;
import hello.domain.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Transactional
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Transactional
    public void deletePost(int id) {
        postRepository.delete(id);
    }

    public List<Post> listAllPost() {
        return postRepository.findAll();
    }

    public Post getPostById(int id) {
        return postRepository.findOne(id);
    }
}
