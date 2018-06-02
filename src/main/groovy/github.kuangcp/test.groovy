package github.kuangcp
//def add(x, y){
//    x + y
//}
//
//def plus = { x, y ->
//    println "$x plus $y is ${x + y}"
//}
//
//add(1, 3)
//plus(2, 3 )

//def show(Function<Integer[], Integer> function, Integer[] params){
//    function.apply(params)
//}
//Integer[] list = [1,2]
//show({ x, y ->
//    println "$x plus $y is ${x + y}"
//}, list)
//



def test() {
    "1"
}


//def C = {
//    item, num, itemRef -> item.setLevelExp(item.getLevelExp()+num*itemRef)
//}
//player = new PlayerBO()
//C(player, 2, 3)
//println player.toString()


//class ApplyWay{
//    static def C = {
//        item, num, itemRef -> item.setLevelExp(item.getLevelExp()+num*itemRef)
//    }
//}
String a = "test"
result = "${a}"()
print(result)