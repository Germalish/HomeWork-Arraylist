package LogicHandle;

import entity.Bot;
import entity.Member;
import run.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public  class BotAction {
    public  static void botInformation() {
        Bot bot0 = new Bot("Yasuo", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot1 = new Bot("Zed", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot2 = new Bot("Leesin", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot3 = new Bot("Anivia", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot4 = new Bot("Jinx", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot5 = new Bot("Jhin", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot6 = new Bot("Darius", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot7 = new Bot("Draven", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot8 = new Bot("Fiora", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot9 = new Bot("Yi", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot10 = new Bot("Garen", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot11 = new Bot("Nunu", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot12 = new Bot("Lulu", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot13 = new Bot("Maokai", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot14 = new Bot("Camile", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot15 = new Bot("Sylas", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot16 = new Bot("Gwen", ThreadLocalRandom.current().nextInt(1000, 2000));
        Bot bot17 = new Bot("Orn", ThreadLocalRandom.current().nextInt(1000, 2000));
        Main.members1.add(bot0);Main.members1.add(bot1);Main.members1.add(bot2);Main.members1.add(bot3);Main.members1.add(bot4);
        Main.members1.add(bot5);Main.members1.add(bot6);Main.members1.add(bot7);Main.members1.add(bot8);Main.members1.add(bot9);
        Main.members1.add(bot10);Main.members1.add(bot11);Main.members1.add(bot12);Main.members1.add(bot13);Main.members1.add(bot14);
        Main.members1.add(bot15);Main.members1.add(bot16);Main.members1.add(bot17);
    }
}

