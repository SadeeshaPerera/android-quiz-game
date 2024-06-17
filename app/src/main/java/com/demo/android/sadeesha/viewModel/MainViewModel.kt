package com.demo.android.sadeesha.viewModel

import androidx.lifecycle.ViewModel
import com.demo.android.sadeesha.data.QuestionInfoProvider
import com.demo.android.sadeesha.data.QuizRepository

class MainViewModel(private val repository: QuizRepository): ViewModel() {

    private lateinit var  questionInfoProvider: QuestionInfoProvider

    fun prepopulateQuestions(){
        questionInfoProvider = QuestionInfoProvider()
        for (question in questionInfoProvider.questionList){
            repository.saveQuestion(question)
        }
        for (answer in questionInfoProvider.answerList){
            repository.saveAnswer(answer)
        }
    }

    fun clearQuestions() = repository.deleteQuestions()

}