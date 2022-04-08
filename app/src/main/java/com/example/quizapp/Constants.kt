package com.example.quizapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        // 1
        val que1=Question(1,
            "Which one is the first search engine in internet?",
            "Archie",
            "Google",
            "WAIS",
            "Altavista",
            1
        )
        questionsList.add(que1)
        // 2
        val que2 = Question(
            2, "First computer virus?",
            "Rabbit", "ELK Cloner",
            "Creeper Virus", "SCA Virus", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Number of layers in OSI Model?",
            "5", "11",
            "3", "7", 4
        )

        questionsList.add(que3)

        return questionsList

    }
}