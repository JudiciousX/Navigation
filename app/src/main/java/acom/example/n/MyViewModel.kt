package acom.example.n

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(){
     var number = MutableLiveData<Int>()

     init {
         number.value = 0
     }

     fun add(x : Int) {
          number.value = number.value ?.let {
               it + x
          }
          if(number.value!! < 0) {
               number.value = 0
          }
     }

}