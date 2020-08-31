

fun main(){

    do{
     println("::Bienvenido a Recipe Maker ::")
     println("")
     println("Selecciona la opción deseada:")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")
        var response:String?= readLine()

        when(response){
             "1"->buildRecipe()
             "2"->viewRecipe()
             "3"->println("Gracias, hasta pronto")
             else -> println("Opcion Invalida")

        }


    }while(!response.equals("3"))


}

fun buildRecipe(){
    println("Creando recetas")
}

fun viewRecipe(){
    println("Mostrando recetas")
}