Algoritmo Login
    Definir usuario_correcto, contrasena_correcta Como Caracter
	Definir usuario_correcto2, contrasena_correcta2 Como Caracter
	Definir usuario_correcto3, contrasena_correcta3 Como Caracter
	Definir usuario_correcto4, contrasena_correcta4 Como Caracter
    Definir usuario, contrasena Como Caracter
    
    usuario_correcto <- "Saralith"
    contrasena_correcta <- "sari"
    
	usuario_correcto2 <- "Ainara"
    contrasena_correcta2 <- "ain"
	
	usuario_correcto3 <- "Alba"
    contrasena_correcta3 <- "alb"
	
	usuario_correcto4 <- "Jon"
    contrasena_correcta4 <- "jo"
    Repetir
        Escribir "Ingrese su nombre de usuario:"
        Leer usuario
        Escribir "Ingrese su contraseña:"
        Leer contrasena
        
        Si usuario = usuario_correcto Y contrasena = contrasena_correcta o usuario = usuario_correcto2 Y contrasena = contrasena_correcta2  o usuario = usuario_correcto3 Y contrasena = contrasena_correcta3 o usuario = usuario_correcto4 Y contrasena = contrasena_correcta4
			Entonces
            Escribir "Login exitoso"
        Sino
            Escribir "Usuario o contraseña incorrectos. Intente de nuevo."
        FinSi
    Hasta Que usuario = usuario_correcto Y contrasena = contrasena_correcta o usuario = usuario_correcto2 Y contrasena = contrasena_correcta2  o usuario = usuario_correcto3 Y contrasena = contrasena_correcta3 o usuario = usuario_correcto4 Y contrasena = contrasena_correcta4
FinAlgoritmo
