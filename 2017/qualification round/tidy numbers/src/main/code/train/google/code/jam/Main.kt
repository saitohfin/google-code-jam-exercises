package train.google.code.jam

import java.io.File

fun main(args: Array<String>){
    File("src/main/resources/B-small-practice.in").forEachLine { println(TidyNumber(it.toLong()).number()) }
}