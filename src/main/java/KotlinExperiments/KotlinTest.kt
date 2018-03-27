package KotlinExperiments

class HelloWorld {
    val developer = 50;
    val tester = 50;
    fun hellowWorld() {
        val sum = developer + tester;
        print(sum);
    }
}

fun main(args: Array<String>) {
    val hello = HelloWorld();
    hello.hellowWorld();
}