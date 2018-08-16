package com.example;

import java.util.*;

public class Game {
    public Puke puke;
    public Map<String,Player> players;

    public Game(){
        this.puke = new Puke();
        this.players = new HashMap<>();
    }

    public void CreatPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------创建玩家----------------------");
        for (int i = 1; i < 3;) {
            System.out.println("请输入第" + i + "位玩家ID和姓名：");
            System.out.println("请输入玩家ID：");
            String playerId = scanner.next();
            Player player = players.get(playerId);
            if (player ==null){
                System.out.println("请输入玩家姓名：");
                String playerName = scanner.next();
                Player newPlayer = new Player(playerId,playerName);
                players.put(playerId,newPlayer);
                i++;
            }else {
                System.out.println("该玩家已存在，请重新加入新玩家！");
                continue;
            }
        }
    }

    public void FaPai(){
        Set<String> keySet = players.keySet();
        for (String key:keySet) {
            System.out.println("----------欢迎玩家：" + players.get(key).playerName);
        }
        System.out.println("-------------------开始发牌----------------------");
        for (int i = 0 ; i < 4; i++){
            String pai = puke.pukeList.get(i);
            String playerFlag = "1";
            if (i % 2 != 0) {
                playerFlag = "2";
            }
            System.out.println("----------玩家：" + players.get(playerFlag).playerName + "-拿牌");
            players.get(playerFlag).ShouPai.add(pai);
            }
        System.out.println("-------------------发牌结束----------------------");
    }

    public void beginGame(){
        System.out.println("-------------------开始游戏----------------------");
        Set<String> keySet = players.keySet();
        for (String key:keySet) {

        }
    }

    public static void main(String[] args){
        Game game = new Game();
        game.puke.setPukeList();
        game.puke.Shuffle();
        game.CreatPlayer();
        game.FaPai();
    }
}
