fun main() {
	val cinema = 7;
    
    when(cinema){
        in 1..10 -> println("Fileira A")
  		in 11..20 -> println("Fileira B")
  		in 21..30 -> println("Fileira C")
  		in 31..40 -> println("Fileira D")
    }
}