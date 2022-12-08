package firstapp.firstwebapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    public String description () {
        return """
                (Название проекта - FirstWebApp /
                 Функции проекта - обработка запросов /
                 С помощью каких технологий будет реализован проект - maven и springboot /
                 На каком языке проект написан - java.)""";
    }

    @GetMapping("/")
    public String project () {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String projectDescription () {
        return """
                Имя ученика - Завьялов Дмитрий /
                 Название проекта - Учебный проект /
                 Дата создания проекта - 08.12.2022 /
                 Описание проекта :""" + description();
    }
}
