package Ludo;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Tablero extends JFrame {
    private JLabel[][] casilleros;
    public Tablero() {
        Font fuente = new Font("", Font.BOLD, 10);
        setTitle("Tablero");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLayout(new GridLayout(15, 15));
        casilleros = new JLabel[15][15];
        // FLECHAS
        // ⬆  ⬇  ⬅  ➡ 👉 👈 👆 👇
        // 🢂  🢁  🢀  🢃  🌟  ⭐  🔘
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                casilleros[i][j] = new JLabel();
                casilleros[i][j].setOpaque(true);
                casilleros[i][j].setBackground(Color.WHITE);

                // COLORES DE LAS CASILLAS DE LOS 4 JUGADORES

                // JUGADOR DE COLOR VERDE
                if (i < 6 && j < 6) {
                    casilleros[i][j].setBackground(Color.green);
                }
                if (i == 6 && j == 1) {
                    casilleros[i][j].setBackground(Color.green);
                }
                if (i == 7 && (j >= 1 && j <= 6)) {
                    casilleros[i][j].setBackground(Color.green);
                }

                // JUGADOR DE COLOR ROJO
                if ((i >= 9 && i <= 14) && (j >= 0 && j <= 5)) {
                    casilleros[i][j].setBackground(Color.red);
                }
                if (i == 13 && j == 6) {
                    casilleros[i][j].setBackground(Color.red);
                }
                if (j == 7 && (i >= 8 && i <= 13)) {
                    casilleros[i][j].setBackground(Color.red);
                }

                // JUGADOR DE COLOR AMARILLO
                if ((i >= 0 && i <= 5) && (j >= 9 && j <= 14)) {
                    casilleros[i][j].setBackground(Color.yellow);
                }
                if (i == 1 && j == 8) {
                    casilleros[i][j].setBackground(Color.yellow);
                }
                if (j == 7 && (i >= 1 && i <= 6)) {
                    casilleros[i][j].setBackground(Color.yellow);
                }

                // JUGADOR DE COLOR AZUL
                if ((i >= 9 && i <= 14) && (j >= 9 && j <= 14)) {
                    casilleros[i][j].setBackground(Color.blue);
                }
                if (i == 8 && j == 13) {
                    casilleros[i][j].setBackground(Color.blue);
                }
                if (i == 7 && (j >= 8 && j <= 13)) {
                    casilleros[i][j].setBackground(Color.blue);
                }

                // SPAWN
                if ((i == 1 || i == 4 || i == 10 || i == 13) && (j == 1 || j == 4 || j == 10 || j == 13)) {
                    casilleros[i][j].setText("     🔘");
                }

                casilleros[i][j].setBorder(new LineBorder(Color.black));
                add(casilleros[i][j]);
            }
        }

        casilleros[7][7].setText("     👑");
        casilleros[7][7].setFont(fuente);
        casilleros[6][6].setBackground(Color.black);
        casilleros[8][8].setBackground(Color.black);
        casilleros[8][6].setBackground(Color.black);
        casilleros[6][8].setBackground(Color.black);
        // FLECHAS DE INICIO
        casilleros[0][7].setText("     🢃");
        casilleros[7][0].setText("     🢂");
        casilleros[7][14].setText("     🢀");
        casilleros[14][7].setText("     🢁");

        // CASILLAS DONDE TE HACES INMUNE
        casilleros[2][6].setText("     ✪");
        casilleros[6][12].setText("     ✪");
        casilleros[8][2].setText("     ✪");
        casilleros[12][8].setText("     ✪");
    }
}