package com.tecno.tienda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tecno.tienda.model.Categoria;
import com.tecno.tienda.model.Producto;
import com.tecno.tienda.service.CategoriaService;
import com.tecno.tienda.service.ProductoService;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner cargarDatos(CategoriaService categoriaService,
                                  ProductoService productoService) {
        return args -> {
            if (categoriaService.listarTodas().isEmpty()) {

                Categoria Consola = categoriaService.guardar(
                    new Categoria(null, "Consola", "Consola de videojuegos"));
                Categoria Videojuego = categoriaService.guardar(
                    new Categoria(null, "Videojuego", "juegos de video"));
                Categoria Perifericos = categoriaService.guardar(
                    new Categoria(null, "Perifericos", "Auriculares, Teclados, Mouse, etc"));
                Categoria Componentes = categoriaService.guardar(
                    new Categoria(null, "Componentes", "Procesadores, Memorias, PLacas de video, etc"));
        
                // Consola
                productoService.guardar(new Producto(null,
                    "Xbox Series S 512 GB de Microsoft", 500, 20,
                    "https://images.fravega.com/f300/d14b8913da29491d66c856048692a9c7.jpg.webp",
                    Consola));
                productoService.guardar(new Producto(null,
                    "Consola Nintendo Switch 2", 500, 50,
                    "https://images.fravega.com/f300/90f7e78da47972d426dc32bffb291a7d.jpg.webp",
                    Consola));
                productoService.guardar(new Producto(null,
                    "PlayStation 5 Pro 2 TB", 900, 30,
                    "https://images.fravega.com/f300/b7a309dc4317d5fd90d378d125a95d32.png.webp",
                    Consola));
                

                // Videojuego
                productoService.guardar(new Producto(null,
                    "The Elder Scrolls V: Skyrim", 40, 40,
                    "https://media.vandal.net/t200/9688/20111112104526_1.jpg",
                    Videojuego));
                productoService.guardar(new Producto(null,
                    "Elden Ring", 60, 5,
                    "https://media.vandal.net/t200/74234/elden-ring-202161213154579_1.jpg",
                    Videojuego));
                productoService.guardar(new Producto(null,
                    "The Legend of Zelda: Tears of the Kingdom", 70, 8,
                    "https://media.vandal.net/t200/74464/the-legend-of-zelda-tears-of-the-kingdom-202291410341410_1.jpg",
                    Videojuego));
                productoService.guardar(new Producto(null,
                    "God of War", 50, 15,
                    "https://media.vandal.net/m/27407/god-of-war-201837182554_1.jpg",
                    Videojuego));
                
                // Componentes
                productoService.guardar(new Producto(null,
                    "Auriculares Redragon", 40, 12,
                    "https://imagenes.compragamer.com/productos/compragamer_Imganen_general_17681_Auriculares_Redragon_Lamia_H320_RGB_7.1_Black_49c998dc-grn.jpg",
                    Perifericos));
                productoService.guardar(new Producto(null,
                    "Teclado Mecanico HyperX ", 100, 12,
                    "https://imagenes.compragamer.com/productos/compragamer_Imganen_general_28977_Teclado_Mecanico_HyperX_Alloy_Origins_60__Switch_Linear_RED_RGB_ENG_d7ac3439-grn.jpg",
                    Perifericos));

                // Componentes
                productoService.guardar(new Producto(null,
                    "Disco externo portátil 2TB USB 3.0", 80, 25,
                    "https://fakestoreapi.com/img/61IBBVJvSDL._AC_SY879_t.png",
                    Componentes));
                productoService.guardar(new Producto(null,
                    "SSD interno 1TB SATA III", 65, 18,
                    "https://fakestoreapi.com/img/61U7T1koQqL._AC_SX679_t.png",
                    Componentes));
                
            }
        };
    }
}