package com.example.sbbmission2;

import com.example.sbbmission2.answer.Answer;
import com.example.sbbmission2.answer.AnswerRepository;
import com.example.sbbmission2.question.Question;
import com.example.sbbmission2.question.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbMission2ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;



    @Transactional
    @Test
    void testJpa() {
        Optional< Question > oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List< Answer > answerList = q.getAnswerList();

        assertEquals(2, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
    }

}
