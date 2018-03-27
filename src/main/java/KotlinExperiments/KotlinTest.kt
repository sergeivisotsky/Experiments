package KotlinExperiments

class HelloWorld {
    val developer = 50;
    val tester = 50;
    fun hellowWorld() {
        val sum = developer + tester;
        print(sum);
        println("%")
    }

    fun helloSaturn() {
        println("Hello saturn!");
    }
}

fun main(args: Array<String>) {
    val hello = HelloWorld();
    hello.hellowWorld();
    hello.helloSaturn();
}