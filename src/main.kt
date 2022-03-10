fun main(){
    println("hello")
    hive()
    var modulus=invoke(30,4)
    println(modulus)
    var take=data("phelisia","22")
    println(take)
    string()


}
fun hive(){
    var codehive="codehive"
    var cha5=codehive[4]
    var cha6=codehive[5]
    var cha7=codehive[6]
    var cha8 =codehive[7]
    println(cha5.toString()+cha6+cha7+cha8)

}
fun invoke (X:Int,Y:Int):Int{
    var divide= X%Y
    return divide

}
fun data (p:String,z:String):String{
var info ="Hi my $p and i am $z years old"
    return info

}
fun string(){
    var take="phelisia"
    println(take.length)
}