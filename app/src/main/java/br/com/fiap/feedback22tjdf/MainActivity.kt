package br.com.fiap.feedback22tjdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var games = mutableListOf<Games>(
        Games(R.drawable.grandtheftautov, "Grand Theft Auto V", "Grand Theft Auto V é um jogo eletrônico de ação-aventura desenvolvido pela Rockstar North e publicado pela Rockstar Games.", "R$ 99,99"),
        Games(R.drawable.thewitcher3, "The Witcher 3: Wild Hunt", "The Witcher 3: Wild Hunt é um jogo eletrônico de RPG de ação em mundo aberto desenvolvido pela CD Projekt RED e lançado no dia 19 de maio de 2015 para as plataformas Microsoft Windows, PlayStation 4, Xbox One e em outubro de 2019 para o Nintendo Switch, sendo o terceiro título da série de jogos The Witcher.", "R$ 100,00"),
        Games(R.drawable.minecraft, "Minecraft", "Minecraft é um jogo eletrônico sandbox de sobrevivência criado pelo desenvolvedor sueco Markus \"Notch\" Persson e posteriormente desenvolvido e publicado pela Mojang Studios, cuja propriedade intelectual foi obtida pela Microsoft em 2014.", "R$ 27,90"),
        Games(R.drawable.reddeadredemption, "Red Dead Redemption", "Red Dead Redemption é um jogo eletrônico de ação-aventura desenvolvido pela Rockstar San Diego e publicado pela Rockstar Games. Ele foi lançado em maio de 2010 para PlayStation 3 e Xbox 360, sendo um sucessor espiritual de Red Dead Revolver lançado em 2004.", "R$ 17,48"),
        Games(R.drawable.tonyhawksproskater2, "Tony Hawk's Pro Skater 2", "ony Hawk's Pro Skater 2 é o segundo jogo da série Tony Hawk's. Foi desenvolvido pela Neversoft e publicado pela Activision em 2000. O jogo foi primeiramente lançado para o PlayStation, logo depois lançado para o Nintendo 64, Dreamcast e Game Boy Color.", "R$ 25,00"),
        Games(R.drawable.doom, "Doom", "Doom é um jogo de computador lançado em 1994 pela id Software e um dos títulos que geraram o gênero tiro em primeira pessoa.", "R$ 42,55"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = GamesAdapter(games)

        val itemDecor = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(itemDecor)
    }
}