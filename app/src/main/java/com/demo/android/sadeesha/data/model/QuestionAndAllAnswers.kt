package com.demo.android.sadeesha.data.model

import androidx.room.Embedded
import androidx.room.Relation

class QuestionAndAllAnswers {
    @Embedded
    var question: Question? = null

    @Relation(parentColumn = "question_id",
        entityColumn = "question_id")
    var answers: List<Answer> = ArrayList()
}