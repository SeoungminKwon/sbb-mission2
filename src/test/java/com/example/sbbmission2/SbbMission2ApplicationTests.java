package com.example.sbbmission2;

import com.example.sbbmission2.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbMission2ApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void TestJpa() {
        for (int i = 0; i <= 300; i++) {
            String subject = String.format("테스트데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content);

        }
    }

}
