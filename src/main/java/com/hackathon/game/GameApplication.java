package com.hackathon.game;

import com.hackathon.game.entity.*;
import com.hackathon.game.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import org.springframework.context.annotation.Bean;

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
			HeroRace astronaut = new HeroRace("Космонавт");

			HeroClass warrior = new HeroClass("Воин");
			HeroClass archer = new HeroClass("Воин-лучник");
			HeroClass magician = new HeroClass("Волшебник");
			HeroClass burglar = new HeroClass("Вор-взломщик");

			HeroGuild ironBank = new HeroGuild("Железный банк");
			HeroGuild thePiratesOfTheSouthernSea = new HeroGuild("Пираты южных морей");
			HeroGuild warlocksClan = new HeroGuild("Клан чернокнижников");

			heroClassRepository.save(warrior);
			heroClassRepository.save(archer);
			heroClassRepository.save(magician);
			heroClassRepository.save(burglar);

			heroGuildRepository.save(ironBank);
			heroGuildRepository.save(thePiratesOfTheSouthernSea);
			heroGuildRepository.save(warlocksClan);

			heroRaceRepository.save(astronaut);
			heroRaceRepository.save(ork);
			heroRaceRepository.save(elf);
			heroRaceRepository.save(goblin);
			heroRaceRepository.save(human);
			heroRaceRepository.save(undead);

			Cluster loot = new Cluster("Loot", "Игровые предметы, необходимые герою");
			Cluster state = new Cluster("State", "Атрибуты, описывыающие состояние персонажа");

			clusterRepository.save(loot);
			clusterRepository.save(state);

			Property healthPoint = new Property("healthPoint", "Integer", state);
			Property mana = new Property("mana", "Integer", state);
			Property gold = new Property("gold", "Integer", state);
			Property lastActive = new Property("lastActive", "Date", state);
			Property level = new Property("level", "Integer", state);

			Property hat = new Property("boot", "Enum", loot);
			Property boots = new Property("hat", "Enum", loot);
			Property armor = new Property("body", "Enum", loot);

			propertyRepository.save(healthPoint);
			propertyRepository.save(mana);
			propertyRepository.save(gold);
			propertyRepository.save(lastActive);
			propertyRepository.save(level);

			propertyRepository.save(hat);
			propertyRepository.save(boots);
			propertyRepository.save(armor);

			PropertyDefinition leatherHat = new PropertyDefinition("leather", hat);
			PropertyDefinition textileHat = new PropertyDefinition("textile", hat);
			PropertyDefinition steelHat = new PropertyDefinition("steel", hat);

			PropertyDefinition leatherBoots = new PropertyDefinition("leather", boots);
			PropertyDefinition textileBoots = new PropertyDefinition("textile", boots);
			PropertyDefinition steelBoots = new PropertyDefinition("steel", boots);

			PropertyDefinition leatherArmor = new PropertyDefinition("leather", armor);
			PropertyDefinition textileArmor = new PropertyDefinition("textile", armor);
			PropertyDefinition steelArmor = new PropertyDefinition("steel", armor);

			propertyDefinitionRepository.save(leatherHat);
			propertyDefinitionRepository.save(textileHat);
			propertyDefinitionRepository.save(steelHat);

			propertyDefinitionRepository.save(leatherBoots);
			propertyDefinitionRepository.save(textileBoots);
			propertyDefinitionRepository.save(steelBoots);

			propertyDefinitionRepository.save(leatherArmor);
			propertyDefinitionRepository.save(textileArmor);
			propertyDefinitionRepository.save(steelArmor);

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
					"https://robohash.org/isteitaquedolor.png?size=50x50&set=set1",
					"Азок Осквернитель, персонаж Властелина колец",
					LocalDate.now(),
					ironBank,
					warrior,
					ork
			);

			Hero legolas = new Hero(
					"Леголас",
					"https://robohash.org/culpadictaquia.png?size=50x50&set=set1",
					"Леголас, персонаж Властелина колец",
					LocalDate.now(),
					thePiratesOfTheSouthernSea,
					archer,
					elf
			);

			Hero sarumanTheWise = new Hero(
					"Саруман Мудрый",
					"https://robohash.org/quamrepellenduset.png?size=50x50&set=set1",
					"Саруман, персонаж Властелина колец",
					LocalDate.now(),
					warlocksClan,
					magician,
					human
			);

			heroRepository.save(bilbo);
			heroRepository.save(azok);
			heroRepository.save(legolas);
		};
	}

	@Bean
	public ModelMapper getMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setSkipNullEnabled(true);

		return modelMapper;
	}

}
