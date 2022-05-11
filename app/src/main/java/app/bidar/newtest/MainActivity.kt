package app.bidar.newtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.bidar.newtest.ui.theme.NewTestTheme
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewTestTheme {
        Greeting("Android")
    }
}

/*
@rezajax
solve example on this link
https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-1#codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems
* */

// example end
fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {

    return bid?.amount ?: minimumPrice

/*    return if (bid != null) {
        bid.amount
    } else {
        minimumPrice
    }


    if (bid != null) {
        return bid.amount
    } else {
        return minimumPrice
    }*/
}



// example 6
/*
fun main() {
    val fp = FoldablePhone()
    fp.checkPhoneScreenLight()
    fp.isFoldable = true
    fp.switchOn()
    fp.checkPhoneScreenLight()
}


class FoldablePhone: Phone() {

    var isFoldable: Boolean = false

    override fun switchOn() {
        if (isFoldable) isScreenLightOn = true
    }
}


open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}
*/



// example 5
/*fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            print("Likes to $hobby.")
        }

        if (referrer != null) {
            println(" Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println(" Doesn't have a referrer.")
        }

        println()
    }
}*/




// example 4
/*
fun main() {
    val newMusic = music("shadmehr", "sh" , "19", playCount = 999)
    newMusic.print()
    newMusic.isPupolar()
}




class music(
    val title: String,
    val artist: String,
    val yearPublished: String,
    val playCount: Int,
) {

    val isPopular: Boolean
        get() = playCount >= 1000


    fun isPupolar() {
        if (playCount >= 1000) {
            println("true")
        } else {
            println("false")
        }
    }



    fun print() {
        println(
            "$title, performed by $artist, was released in $yearPublished."
        )
    }
}*/


// example 3
/*
fun main() {
    val coins: (Double) -> Double = { input ->
        (1.8 * input) + 32
    }
    //cel to far
    printFinalTemperature(27.0, "Cel", "fah") {(1.8 * it) + 32}
    printFinalTemperature(135.0, "Cel", "fah") { it - 273.15 }
    printFinalTemperature(10.0, "Cel", "fah") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

*/




// example 2
/*fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is  \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    if (age <= 12) {
        return 15
    } else if (age in 13..60) {
        if (isMonday){
            return 25
        }
        return 30
    } else if (age >= 61) {
        return 20
    }


    else {
        return -1
    }
}*/





// example 1
/*

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    */
/*if ( !(numberOfMessages >= 100) ) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
    }
    *//*



*/
/*    val message =
        if (numberOfMessages > 99) "Your phone is blowing up! You have 99+ notifications."
        else "You have $numberOfMessages notifications."

    println(message)*//*


    println (
        if (numberOfMessages > 99) "Your phone is blowing up! You have 99+ notifications."
        else "You have $numberOfMessages notifications."
    )
}*/
