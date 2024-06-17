package com.demo.android.sadeesha.data

import androidx.lifecycle.LiveData
import com.demo.android.sadeesha.data.model.Answer
import com.demo.android.sadeesha.data.model.Question
import com.demo.android.sadeesha.data.model.QuestionAndAllAnswers

interface QuizRepository {
    fun getSavedQuestions(): LiveData<List<Question>>

    fun saveQuestion(question: Question)

    fun saveAnswer(answer: Answer)

    fun getQuestionAndAllAnswers(): LiveData<List<QuestionAndAllAnswers>>

    fun deleteQuestions()
}