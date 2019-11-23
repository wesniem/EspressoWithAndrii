package com.example.espressoactivity.utils

class Observable<T> constructor(initialValue: T): IObservable<T> {

    private val listOfObservers: MutableList<Observer<T>> = mutableListOf()

    private var currentValue: T = initialValue

    override fun subscribe(observer: Observer<T>){
        listOfObservers.add(observer)
        observer.onValueChanged(currentValue)
    }

    override fun unsubscribe(observer: Observer<T>){
        listOfObservers.remove(observer)
    }

    fun pushValue(value: T){
        currentValue = value
        listOfObservers.forEach { observer -> observer.onValueChanged(currentValue) }
    }

}

interface IObservable<M> {
    fun subscribe(observer: Observer<M>)
    fun unsubscribe(observer: Observer<M>)
}

interface Observer<D> {
    fun onValueChanged(newValue: D)
}