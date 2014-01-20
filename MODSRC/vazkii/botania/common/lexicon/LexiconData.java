/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jan 14, 2014, 9:12:15 PM (GMT)]
 */
package vazkii.botania.common.lexicon;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.LexiconCategory;
import vazkii.botania.api.LexiconEntry;
import vazkii.botania.client.lib.LibResources;
import vazkii.botania.common.crafting.ModCrafingRecipes;
import vazkii.botania.common.lexicon.page.PageCraftingRecipes;
import vazkii.botania.common.lexicon.page.PageImage;
import vazkii.botania.common.lexicon.page.PageText;
import vazkii.botania.common.lib.LibLexicon;

public final class LexiconData {

	public static LexiconCategory categoryBasics;
	public static LexiconCategory categoryEnergy;
	public static LexiconCategory categoryFlowers;
	public static LexiconCategory categoryDevices;
	public static LexiconCategory categoryTools;
	public static LexiconCategory categoryMisc;
	
	public static LexiconEntry flowers;

	public static void init() {
		BotaniaAPI.addCategory(categoryBasics = new LexiconCategory(LibLexicon.CATEGORY_BASICS));
		BotaniaAPI.addCategory(categoryEnergy = new LexiconCategory(LibLexicon.CATEGORY_ENERGY));
		BotaniaAPI.addCategory(categoryFlowers = new LexiconCategory(LibLexicon.CATEGORY_FLOWERS));
		BotaniaAPI.addCategory(categoryDevices = new LexiconCategory(LibLexicon.CATEGORY_DEVICES));
		BotaniaAPI.addCategory(categoryTools = new LexiconCategory(LibLexicon.CATEGORY_TOOLS));
		BotaniaAPI.addCategory(categoryMisc = new LexiconCategory(LibLexicon.CATEGORY_MISC));

		// BASICS ENTRIES
		flowers = new BLexiconEntry(LibLexicon.BASICS_FLOWERS, categoryBasics);
		flowers.setPriority().setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_FLOWERS), new PageText("2"), new PageCraftingRecipes("3", ModCrafingRecipes.recipesPetals), new PageCraftingRecipes("4", ModCrafingRecipes.recipePestleAndMortar), new PageCraftingRecipes("5", ModCrafingRecipes.recipesDyes));

		// ENERGY ENTRIES

		// FLOWERS ENTRIES

		// DEVICES ENTRIES

		// TOOLS ENTRIES

		// MISC ENTRIES
	}

}
