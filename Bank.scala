object Bank
{
    def interest(amount:Double):Double = amount match{
        case x if x<0 => 0
        case x if x<20000 && x>0 => x*0.02
        case x if x<200000 && x>20000 => x*0.04
        case x if x<2000000 && x> 2000000 => x*0.035
        case x if x>2000000 => x*0.065
    }
    def main(args:Array[String])={
        val inter:Double= interest(25000)
        printf("Interest is: ")
        println(inter)
    }
}