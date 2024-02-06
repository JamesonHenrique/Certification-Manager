package project.certification.modules.questions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.certification.modules.questions.dto.AlternativesResultDTO;
import project.certification.modules.questions.dto.QuestionsResultDTO;
import project.certification.modules.questions.entity.Alternatives;
import project.certification.modules.questions.entity.Questions;
import project.certification.modules.questions.repository.QuestionsRepository;

import java.util.List;
import java.util.stream.Collectors;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/questions")
    public class QuestionController {

        @Autowired
        private QuestionsRepository questionRepository;

        @GetMapping("/technology/{technology}")
        public List<QuestionsResultDTO> findByTechnology(@PathVariable String technology) {
            System.out.println("TECH === " + technology);
            var result = this.questionRepository.findByTechnology(technology);

            var toMap = result.stream().map(question -> mapQuestionToDTO(question))
                    .collect(Collectors.toList());
            return toMap;
        }

        static QuestionsResultDTO mapQuestionToDTO(Questions question) {
            var questionResultDTO = QuestionsResultDTO.builder()
                    .id(question.getId())
                    .technology(question.getTechnology())
                    .description(question.getDescription()).build();

            List<AlternativesResultDTO> alternativesResultDTOs = question.getAlternatives()
                    .stream().map(alternative -> mapAlternativeDTO(alternative))
                    .collect(Collectors.toList());

            questionResultDTO.setAlternatives(alternativesResultDTOs);
            return questionResultDTO;
        }

        static AlternativesResultDTO mapAlternativeDTO(Alternatives alternativesResultDTO) {
            return AlternativesResultDTO.builder()
                    .id(alternativesResultDTO.getId())
                    .description(alternativesResultDTO.getDescription()).build();
        }
    }
