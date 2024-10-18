fun main() {
    var student:Student? = Student() // null

    val student1 = student?.let { st -> // не возвращает обратного значения, работаем с объектом через ключевое слово
        st.hi()
        st.bye()
        st.name = "Masha"
    }
    println(student?.name)
    val student2 = student?.apply { // возвращает измененный объект рабоает с содержимым объекта
        hi()
        bye()
        name = "LolKek"
    }
    println(student?.name)
    println(student2?.name)
    val count = Student().run { // возварщает обратное значение с последней строки, работаем с содержимым объекта
        hi()
        bye()
        coutofDebts = 15
        coutofDebts
    }
    println(count)

    val str = with(Student()){ // возварщает обратное значение с последней строки, работаем с содержимым объекта
        hi()
        bye()
        name = "Pasha"
        name
    }
    println(str)

    val student3 = Student().also { st -> // возвращает измененый объект, работает с объектом через ключевое слово
        st.hi()
        st.bye()
        st.coutofDebts = 5
    }
    println(student3.coutofDebts)

}