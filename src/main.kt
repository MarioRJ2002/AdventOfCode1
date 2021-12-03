import java.io.File
import java.io.FileReader

fun main (){

    var fr: FileReader = FileReader(File("input.txt"))

    var profList = mutableListOf<Int>()

    var numPositivos:Int = -1

    var numAnt:Int = 0

    fr.forEachLine {profList.add(it.toInt())}

    profList.forEach { if(it>numAnt){numPositivos++}
                        numAnt=it}

    print(numPositivos)
}