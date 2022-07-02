package com.hackathon.game;

import com.hackathon.game.entity.*;
import com.hackathon.game.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	/**
	* Заполняем БД тестовыми данными
	* */
	@Bean
	public CommandLineRunner demo(
			HeroClassRepository heroClassRepository,
			HeroGuildRepository heroGuildRepository,
			HeroRaceRepository heroRaceRepository,
			ClusterRepository clusterRepository,
			PropertyRepository propertyRepository,
			PropertyDefinitionRepository propertyDefinitionRepository,
			HeroRepository heroRepository
	){
		return args -> {

			HeroRace ork = new HeroRace("Орк");
			HeroRace elf = new HeroRace("Эльф");
			HeroRace goblin = new HeroRace("Гоблин");
			HeroRace human = new HeroRace("Человек");
			HeroRace undead = new HeroRace("Нежить");

			HeroClass warrior = new HeroClass("Воин");
			HeroClass archer = new HeroClass("Воин-лучник");
			HeroClass magician = new HeroClass("Волшебник");
			HeroClass burglar = new HeroClass("Вор-взломщик");

			HeroGuild ironBank = new HeroGuild("Железный банк");
			HeroGuild thePiratesOfTheSouthernSea = new HeroGuild("Пираты южных морей");
			HeroGuild warlocksClan = new HeroGuild("Клан чернокнижников");

			PropertyDefinition leather = new PropertyDefinition("leather");
			PropertyDefinition textile = new PropertyDefinition("textile");
			PropertyDefinition steel = new PropertyDefinition("steel");

			Cluster loot = new Cluster("Loot", "Игровые предметы, необходимые герою");
			Cluster state = new Cluster("State", "Атрибуты, описывыающие состояние персонажа");

			heroClassRepository.save(warrior);
			heroClassRepository.save(archer);
			heroClassRepository.save(magician);
			heroClassRepository.save(burglar);

			heroGuildRepository.save(ironBank);
			heroGuildRepository.save(thePiratesOfTheSouthernSea);
			heroGuildRepository.save(warlocksClan);

			heroRaceRepository.save(ork);
			heroRaceRepository.save(elf);
			heroRaceRepository.save(goblin);
			heroRaceRepository.save(human);
			heroRaceRepository.save(undead);

			propertyDefinitionRepository.save(leather);
			propertyDefinitionRepository.save(textile);
			propertyDefinitionRepository.save(steel);

			Property healthPoint = new Property("healthPoint", "Integer", state);
			Property mana = new Property("mana", "Integer", state);
			Property gold = new Property("gold", "Integer", state);
			Property lastActive = new Property("lastActive", "Date", state);
			Property level = new Property("level", "Integer", state);

			Property hat = new Property("gold", "Enum", loot);
			Property boots = new Property("lastActive", "Enum", loot);
			Property armor = new Property("level", "Enum", loot);

			propertyRepository.save(hat);
			propertyRepository.save(boots);
			propertyRepository.save(armor);

			Hero bilbo = new Hero(
					"Бильбо Бэггинс",
					"https://robohash.org/officiisquiaest.png?size=50x50&set=set1",
					"Бильбо Бэггинс, персонаж Властелина колец",
					LocalDate.now(),
					thePiratesOfTheSouthernSea,
					burglar,
					human
			);

			Hero azok = new Hero(
					"Азок Осквернитель",
					"https://robohash.org/officiisquiaest.png?size=50x50&set=set1",
					"Азок Осквернитель, персонаж Властелина колец",
					LocalDate.now(),
					ironBank,
					warrior,
					ork
			);

			Hero legolas = new Hero(
					"Леголас",
					"https://robohash.org/officiisquiaest.png?size=50x50&set=set1",
					"Леголас, персонаж Властелина колец",
					LocalDate.now(),
					thePiratesOfTheSouthernSea,
					archer,
					elf
			);

			heroRepository.save(bilbo);
			heroRepository.save(azok);
			heroRepository.save(legolas);
		};
	}

}
