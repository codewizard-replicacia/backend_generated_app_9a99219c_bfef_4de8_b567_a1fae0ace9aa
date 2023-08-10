package com.mycompany.group234.repository;


import com.mycompany.group234.model.Feedback;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class FeedbackRepository extends SimpleJpaRepository<Feedback, String> {
    private final EntityManager em;
    public FeedbackRepository(EntityManager em) {
        super(Feedback.class, em);
        this.em = em;
    }
    @Override
    public List<Feedback> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Feedback\"", Feedback.class).getResultList();
    }
}