# TVflix - Android TV POC

Uma **prova de conceito** para explorar o desenvolvimento de aplicativos para **Android TV**, incluindo:

✅ Navegação via **controle remoto (D-Pad)**  
✅ Interface otimizada com **Leanback Library**  
✅ Reprodução de vídeos usando **ExoPlayer**  
✅ Design responsivo para **telas grandes**

---

## ✨ Funcionalidades
- �️ **Navegação intuitiva via controle remoto**
- � **Lista de vídeos organizada por categorias**
- ▶️ **Player de vídeo otimizado com ExoPlayer**
- � **Design adaptado e responsivo para Android TV**

---

## �‍� Tecnologias Utilizadas
- **Kotlin**
- **Android Jetpack (Leanback Library)**
- **ExoPlayer**
- **RecyclerView com Focus Navigation**
- **Android TV Emulator**

---

## �️ Estrutura do Projeto

```
tvflix-android-tv-poc/
│── data/
│   ├── model/            # Modelos de dados (Movie.kt)
│   ├── repository/       # Repositório para buscar dados (MovieRepository.kt)
│── ui/
│   ├── main/             # Tela inicial (MainFragment, MainViewModel)
│   ├── player/           # Tela do player de vídeo (VideoPlayerActivity)
│── utils/                # Classes auxiliares
│── App.kt                # Classe Application
│── di/                   # Configuração do Koin (para Injeção de Dependência)
│── build.gradle.kts      # Configuração do projeto
```

---

## ✨ Como Executar o Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/tvflix-android-tv-poc.git
   ```
2. Abra o projeto no **Android Studio**.
3. Selecione o **Android TV Emulator** ou um dispositivo compatível.
4. Execute o aplicativo.

---
