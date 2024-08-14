

import jakarta.persistence.*
import org.jetbrains.annotations.*



@Entity
class Usuario(
    @Id
    @GeneratedValue
    
   
   val idUsuario:Int,


    @NotNull
   val nombre:String,

)