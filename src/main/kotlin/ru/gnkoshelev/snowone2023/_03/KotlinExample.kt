package ru.gnkoshelev.snowone2023._03

/**
 * Slide 4
 */
fun main() {
    val dog: Animal = Dog()
    val cat: Animal = Cat()
    val hyena: Animal = Hyena()
    println("Dog: " + dog.talk())
    println("Cat: " + cat.talk())
    println("Hyena: " + hyena.talk());
}

interface Talkable {
    fun talk(): String
}

abstract class Animal : Talkable

abstract class Mammal : Animal() {
    fun drinkMilk() {}
}

abstract class Carnivora : Mammal() {
    fun eatFlesh() {}
}

abstract class Caniformia : Carnivora()

abstract class Feliformia : Carnivora()

interface Barkable : Talkable {
    override fun talk(): String = bark()
    fun bark(): String
}

interface Meowable : Talkable {
    override fun talk(): String = meow()
    fun meow(): String
}

class Barking(val s: String) : Barkable {
    override fun bark(): String = s
}

class Meowing(val s: String) : Meowable {
    override fun meow(): String = s
}

class Dog : Caniformia(), Barkable by Barking("Гав!")

class Cat : Feliformia(), Meowable by Meowing("Мяу!")

class Hyena : Feliformia(), Barkable by Barking("Ай!")
