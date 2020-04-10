import kotlin.random.Random

fun main (){
   //reate a lambda and assign it to rollDice,
   // which returns a dice roll (number between 1 and 12).
   //Extend the lambda to take an argument indicating
   // the number of sides of the dice used for the roll.
   //If you haven't done so, fix the lambda to return 0 if
   // the number of sides passed in is 0.
//   val rollDice = { sides: Int ->
//      if (sides == 0) 0
//      else Random.nextInt(sides) + 1
//   }
   //Create a new variable, rollDice2,
   // for this same lambda using the function type notation.
   val rollDice2: (Int) -> Int = { sides ->
      if (sides == 0) 0
      else Random.nextInt(sides) + 1
   }
   // if rooDice was a fun
   fun rollDice(sides: Int) =  Random.nextInt(sides) + 1

   //referncing from a variable
   val value  = Random.nextInt(6) + 1
   val value1 = {Random.nextInt(6) + 1}



   fun gamePlay(rollValue : Int){
      println(value1.invoke())
   }

   repeat(12){
//      println(rollDice.invoke(6))
      gamePlay(rollDice(6))
   }



}