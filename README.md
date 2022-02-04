# Cuenca-Java


## Instalación

#Gradle

1. Agregue el repositorio de JitPack a su archivo de compilación
  ```
  allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
 ```
2.Agrega la dependencia 

```
dependencies {
	        implementation 'com.github.cuenca-mx:cuenca-java:v1.0'
	}
```
3. Indica a tu proyecto que debe leer los cambios realizados en el archivo maven "Load gradle changes"
4. Importa el paquete a tu proyecto con 
 ```
  import com.cuenca.CuencaClient;
```

#Maven

1. Agregue el repositorio de JitPack a su archivo de compilación
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
2. Agrega la dependencia
```
<dependency>
	    <groupId>com.github.cuenca-mx</groupId>
	    <artifactId>cuenca-java</artifactId>
	    <version>v1.0</version>
	</dependency>
```
3. Indica a tu proyecto que debe leer los cambios realizados en el archivo maven "Load maven changes"
4. Importa el paquete a tu proyecto con 
 ```
  import com.cuenca.CuencaClient;
```

