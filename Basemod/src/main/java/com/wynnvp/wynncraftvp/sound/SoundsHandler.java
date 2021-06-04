package com.wynnvp.wynncraftvp.sound;

import com.wynnvp.wynncraftvp.ModCore;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.HashMap;

public class SoundsHandler {
    // public static SoundEvent TALKING_MUSHROOM_RETURNINGARDFD;
    public HashMap<String, CustomSoundClass> sounds;

    public SoundsHandler() {
        sounds = new HashMap<>();
        registerSounds();
    }

    public void registerSounds() {
        //Talking Mushroom
        addSound("[1/1] Talking Mushroom: PRICK.", "talkingmushroomprick", true);
        addSound("[1/2] Talking Mushroom: IF I HAD A MOVABLE NECK, I'D BE TWISTING IT AROUND TO FACE YOU WITH UTTER CONFUSION.", "talkingmushroomragnioutskirts", true);
        addSound("[1/1] Talking Mushroom: WHAT IN THE NAME OF ALL THAT IS HOLY IS GOING THROUGH YOUR HEAD?! WE'RE MILES FROM THE SKY ISLANDS!! WHERE IS THIS PLACE?!", "talkingmushroomragni", true);
        addSound("[1/2] Talking Mushroom: ... STAIRWAY TO HEAVEN, HUH? I DON'T KNOW ABOUT YOU, BUT I DON'T GET THE APPEAL.", "talkingmushroomtherck", true);
        addSound("[1/3] Talking Mushroom: OH, HEY, THIS PLACE IS NICE! IT HAS EVERYTHING A PLACE COULD NEED! MUSHROOMS, COZY HOUSES, BEINGS OF GREAT POWER...", "talkingmushroomelkurn", true);
        addSound("[1/1] Talking Mushroom: SO, WHAT IS THIS PLACE? IS IT A BRIDGE, OR IS IT A TOWN? MAKE UP YOUR DAMN MIND, VILLAGERS!", "talkingmushroombucie", true);
        addSound("[1/1] Talking Mushroom: WOW, REAL GRAND CITY HERE, HUH? THIS PLACE IS HUGE! AND PROBABLY A MESS TO NAVIGATE, REALLY POORLY DESIGNED IF YOU THINK ABOUT IT.", "talkingmushroomllevingar", true);
        addSound("[1/3] Talking Mushroom: ... WOW. I'M... I'M ACTUALLY SHOCKED.", "talkingmushroomforbiddenprison", true);
        addSound("[1/3] Talking Mushroom: HEY, THIS PLACE HAS GOT SOME NICE LOOKING CAPS! DROP ME OFF HERE!", "talkingmushroomyahya", false);
        addSound("[1/2] Talking Mushroom: WAIT, I'VE HEARD OF THIS PLACE. TIME GOES SLOWER HERE, DOESN'T IT?", "talkingmushroomdooroftime", true);
        addSound("[1/1] Talking Mushroom: WHY IS IT SO HOT IN HERE? OH, YOU HAD BETTER NOT BE THINKING WHAT I THINK YOU'RE THINKING! I'M NOT GONNA BE A ROASTED MUSHROOM TODAY!", "talkingmushroommountwynn", true);
        addSound("[1/2] Talking Mushroom: WOAH, THAT THING LOOKS REALLY WEIRD. IS THIS IMPORTANT OR SOMETHING? YEAH, THIS HAS TO BE IMPORTANT!", "talkingmushroomendportal", true);
        addSound("[1/1] Talking Mushroom: I KNOW THESE CANYON EGGS GET LARGE BUT I HAVE TO ASK, HOW DID THE BIRD FIT IN HERE TO MANAGE THIS?!", "talkingmushroommesacanyoneggs", true);
        addSound("[1/8] Talking Mushroom: Y-YOU CAN'T BE SERIOUS. YOU... YOU SHOULDN'T BE HERE. I LOST THAT KEY A LONG TIME AGO, BUT SOMEHOW... YOU FOUND IT AND MADE YOUR WAY HERE. RIGHT, LET ME EXPLAIN.", "talkingmushroombackstorry", true);
        addSound("[1/2] Talking Mushroom: HAHA, LOOK! YOU'RE PRACTICALLY ONE OF THEM, YOU FIT RIGHT IN! NOW STAY HERE LIKE A GOOD ANIMAL AND LET ME GO MY OWN WAY.", "talkingmushroomoutofmymind", true);
        addSound("[1/1] Talking Mushroom: A TREE GUARDIAN? SERIOUSLY?! THAT'S ABOUT AS BELIEVABLE AS A TALKING MUSH...OH WAIT. HUH. CARRY ON.", "talkingmushroomderneltreeguardien", true);
        addSound("[1/1] Talking Mushroom: WAIT, YOU'RE ACTUALLY FALLING FOR THIS STUFF? SERIOUSLY?! IT'S CLEARLY JUST A BUNCH OF SEEDS PAINTED GOLD, ARE YOU QUITE LITERALLY BLIND?", "talkingmushroomzhight", true);
        addSound("[1/4] Talking Mushroom: ...AND I HAD THOUGHT SOME OF YOUR PREVIOUS LOONEY ADVENTURES HAD INDICATED YOU WERE A BUNBLING IDIOT, BUT YOU'VE REALLY OUTDONE YOURSELF... WHERE EVEN ARE WE?!", "talkingmushroombaabsabondedmines", true);
        addSound("[1/1] Talking Mushroom: HEY HEY HEY, WHERE DO YOU THINK YOU'RE GOING? THERE'S A BOUNTY ON MY HEAD HERE SINCE... THE INCIDENT... CAN YOU JUST AVOID THIS PLACE LIKE YOU AVOID MY ADVICE?", "talkingmushroomfrumagate", true);
        addSound("[1/2] Talking Mushroom: OH NO. WHAT DID THAT BUTTON DO? WHAT DID THE BUTTON DO? DID YOU BREAK IT? I BET YOU BROKE IT!", "talkingmushroomheartoflevingar", true);
        addSound("[1/2] Talking Mushroom: I'M GONNA BE STUCK WITH YOU FOREVER, AREN'T I? MAY AS WELL THROW ME IN ONE OF THOSE GRAVES RIGHT NOW!", "talkingmushroomgeilboardcemetary", true);
        addSound("[1/2] Talking Mushroom: OI, WHY'RE YOU TAKING ME ALL THE WAY OUT HERE? MY COUSIN LIVES HERE, I HATE HIM!", "talkingmushroomtrippyforest", true);
        addSound("[1/1] Talking Mushroom: *GASP* *PANT* IS THERE ZERO AIR UP HERE? GET ME DOWN THIS INSTANT! OR IS YOUR BRAIN SO TINY IT DOESN'T NEED OXYGEN TO SURVIVE?!", "talkingmushroomflightindistress", true);
        addSound("[1/2] Talking Mushroom: HEY NUMBSKULL, LEAVE ME HERE, ALRIGHT? I SAW SOME NICE CAPS OVER THERE.", "talkingmushroommushroomcave", true);
        addSound("[1/2] Talking Mushroom: BRILLIANT. ABSOLUTELY BRILLIANT! HOW BRAINDEAD ARE YOU?! THERE'S NOTHING HERE!", "talkingmushroompsiloshouse", true);
        addSound("[1/1] Talking Mushroom: WHO KNEW BEING EATEN ALIVE BY A FIRE-BREATHING DRAGON IS BETTER THAN BEING STUCK WITH YOU?", "talkingmushroomozothgut", true);
        addSound("[1/1] Talking Mushroom: URGH, WHAT IS THAT AWFUL STENCH?! IT'S ALMOST OVERPOWERING YOUR OWN RANCIDNESS! I MEAN, DO YOU EVER BATHE?!", "talkingmushroomcanarycallscave", true);
        addSound("[1/3] Talking Mushroom: ARGH, I'M CURSED, I SWEAR IT! EVEN THE SWEET RELEASE OF DEATH HASN'T GOTTEN ME AWAY FROM YOU! YOU'RE LIKE A COCKROACH!", "talkingmushroomdeathrealm", true);
        addSound("[1/2] Talking Mushroom: YOU KNOW WHAT, TO HECK WITH THIS! I'M BAILING, SEE YA LATER! HAVE A TERRIBLE LIFE, YOU INGRATE!", "talkingmushroommoltenheights", true);
        addSound("[1/1] Talking Mushroom: HOW DID YOU MANAGE TO GET ME TO SOMEPLACE DARKER THAN THE INSIDE OF YOUR SATCHEL? WHAT, DID YOU CRAWL UP SOMETHING'S-", "talkingmushroomfantasticvoyage", true);
        addSound("[1/1] Talking Mushroom: OH GREAT, ANOTHER ONE. JUST FANTASTIC. WHAT'S WITH THE FACE, HUH? NEVER SEEN A TALKING MUSHROOM BEFORE? GO AWAY!", "talkingmushroombeforerecipefordisaster", false);
        addSound("[1/2] Talking Mushroom: OH MY, LOOK WHO'S BACK. HERE I THOUGHT I WAS FREE OF YOUR GRASP AND THEN YOU COME BACK HERE.", "talkingmushroomafterrecipefordistaster", false);
        addSound("[1/2] Talking Mushroom: HEY DWEEB, LOOK OVER THERE! I THINK IT'S... PEOPLE?", "talkingmushroomonethousandmetersunder", true);
        addSound("[1/1] Talking Mushroom: HEY MEATBAG, DON'T YOU THINK YOU'RE A LITTLE FAT FOR THAT THING? WAIT, YOU'RE SERIOUS? STO-AAAHHH!!!", "talkingmushroomcorkuscity", true);
        addSound("[1/1] Talking Mushroom: HUH, THIS VIEW IS GOOD. PSST... I DON'T WANT TO ACKNOWLEDGE THE FACT THAT WE'RE STANDING ON A CLOUD IN FEAR OF IT FALLING APART LIKE SOME CLICHÉ... GOOOOOD VIEW.", "talkingmushroomcorkuscloud", true);
        addSound("[1/1] Talking Mushroom: I BET THE PERSON WHO LIVES HERE DIDN'T EVEN COME UP WITH THIS ROBOT. IT'S TOO GOOD TO BE ORIGINAL.", "talkingmushroomcorkusbastion", true);
        addSound("[1/3] Talking Mushroom: HEY IDIOT, WHERE ARE WE THIS TIME! IT FEELS ALL... BRIGHT, ALMOST EXCESSIVELY SO-", "talkingmushroomnexusoflight", true);
        addSound("[1/3] Talking Mushroom: YOU KNOW, HAVE I EVER TOLD YOU JUST HOW MUCH I HA-", "talkingmushroomrolportal", true);
        addSound("[1/3] Talking Mushroom: SATISFIED YET? CAN YOU TRY UNHINGING HIS JAW AND PUTTING YOUR ARM IN THERE?", "talkingmushroomfeathersflydog", true);
        addSound("[1/1] Talking Mushroom: HEY IDIOT, WHERE ARE WE?? THIS PLACE SMELLS LIKE-", "talkingmushroommonumenttosifried", true);
        addSound("[1/3] Talking Mushroom: WOW. NOW THAT IS A BIG GUY. IT LOOKS ANCIENT! I WONDER WHO COULD'VE BUILT SOMETHING LIKE THIS...", "talkingmushroomtcc", true);
        addSound("[1/4] Talking Mushroom: ... WOW. I'M SPEECHLESS. HUMAN, ARE YOU SEEING THIS PLACE? WITH THE NUMBER OF EMERALDS HERE... WE'RE GONNA BE RICH!!", "talkingmushroomabondedmines", true);
        addSound("[1/2] Talking Mushroom: ... ALRIGHT. I'VE ACCEPTED THAT YOU GO TO WEIRD PLACES BUT THIS CROSSES THE LINE. WHERE EVEN ARE WE?", "talkingmushroomeyeballforest", true);
        addSound("[2/4] Talking Mushroom: GREAT JOB! YOU SOMEHOW MANAGED TO FALL OUT OF REALITY BY DOING ABSOLUTELY NOTHING!", "talkingmushroomotherworldyoccurence", true);
        addSound("[1/5] Talking Mushroom: ALRIGHT, HOLD UP, LET ME GET SOMETHING STRAIGHT HERE. YOU ACTUALLY THINK IT'S A GOOD IDEA TO GO INSIDE THAT OMINOUS DOME THAT'S LITERALLY ERUPTING WITH THIS HORRIBLE DARK SENSATION FOR... WHAT REASON??", "talkingmushroombeforeeyefight", true);
        addSound("[1/3] Talking Mushroom: OH. OH, I DON'T- I DON'T LIKE THIS PLACE. AT ALL. WH-WHERE ARE WE??", "talkingmushroombotomlesspit", true);
        addSound("[1/1] Talking Mushroom: WOAH, HEY, WH-WHAT ARE WE DOING HERE, HUMAN?? IT'S... IT'S PROBABLY DANGEROUS IN THERE! Y-YOU WOULDN'T WANT TO DIE, WOULD YOU???", "talkingmushroomsecretariodopassage", true);
        addSound("[1/3] Talking Mushroom: WOW, LOTS OF POWERFUL MAGIC HERE, HUH?? MUCH STRONGER THAN ANYTHING YOU COULD EVER DO, THAT'S FOR SURE!", "talkingmushroomhouseoftwain", true);
        addSound("[1/2] Talking Mushroom: OH, LOOK AT THESE THINGS. THEY'RE KIND OF CUTE. A LITTLE BIT TOO CUTE... IT'S A CONSPIRACY, I TELL YOU!", "talkingmushroomwybelisland", true);
        addSound("[1/3] Talking Mushroom: I KNEW IT! IT'S ALL A CONSPIRACY!", "talkingmushroomorangewybelactor", true);
        addSound("[1/1] Talking Mushroom: THIS BRIDGE SEEMS DIFFERENT SINCE YOU LAST CROSSED IT, OR IS IT JUST ME? IT MIGHT JUST BE YOUR 247TH TIME CROSSING IT THAT'S DISORIENTATING ME… OR DID I LOSE COUNT AGAIN?", "talkingmushroomnivadetlasbridge", true);
        addSound("[1/2] Talking Mushroom: WOAH, WAIT. WHERE ARE WE? WHAT ARE YOU DOING HE-", "talkingmushroomhiddencamp", true);
        addSound("[1/3] Talking Mushroom: ...I DON'T KNOW WHAT MANIC IDEA YOU'RE ABOUT TO HAVE NOW, BUT I'M GOING TO PUT AN END TO IT RIGHT NOW. YOU DO NOT WANT TO GO IN THERE.", "talkingmushroomoutsideeo", true);
        addSound("[1/3] Talking Mushroom: REALLY COOL CITY, HUH? BUILT UP ON THE CLIFFS, VERY STYLISH, IS THAT WHAT YOU'RE THINKING?", "talkingmushroomkandon", true);

        //Creeper Infiltration
        addSound("[1/7] Thomas: Oh, finally, someone has come to this hidden village!", "thomas_creeperinfl_1", false);
        addSound("[1/10] Thomas: I didn't expect you to fall out of the sky like that. Are you okay, or should I go get the potion merchant to heal you?", "thomas_creeperinfl_2", false);
        addSound("[1/6] Thomas: I see you have the hide. This skin will work perfectly for my plan.", "thomas_creeperinfl_3", false);
        addSound("[1/7] Thomas: So, what was in the cave? Were there really creepers in there?", "thomas_creeperinfl_4", false);

        //Maltics Well
        addSound("[1/4] Rynend: Please help us! We called for a Ragni guard days ago, but Humans tend to forget this little village.", "malticwellrysend1", false);
        addSound("[1/1] Child: Help me! Someone! The witch is being mean!!", "malticwellchild", true);
        addSound("[1/2] Witch: I don't know why they call me a witch. Magic is everywhere, you know. This one's father made fun of my looks, so I'll turn his son into a Grook!", "malticwellwitch1", false);
        addSound("[1/2] Witch: Oh...drat. I never could get that spell right. Well, now you'll have to guess the way, um, you fool! Turn back now, for, uh...", "malticwellwitch2", false);
        addSound("[1/4] Witch: Oh...didn't think that'd fool you. You know, I'm really not all that good at magic. I just like wearing pointy hats, and have warts.", "malticwellwitch3", false);
        addSound("[1/3] Rynend: Oh my son! What happened down there? Erh, not a witch, you say?", "malticwellrysend2", false);

        //Grave Digger
        addSound("[1/8] Sayleros: You sure look like a strong adventurer who could help me!", "gravediggersayleros1", false);
        addSound("[1/2] Drucksh: Mmh. g... uh! oh, why hello there.", "gravediggerdrucksch1", false);
        addSound("[1/4] Drucksh: Ohh mmhhhgg... g-g-good old Nemract whiskey!", "gravediggerdrucksch2", false);
        addSound("[1/4] The Priest: Are you trying to go down into the crypt? Oh, that is a very bad idea.", "gravediggerpriest1", false);
        addSound("[1/2] The Priest: You got the flesh. Good.", "gravediggerpriest2", false);
        addSound("[1/1] Sayleros: Brilliant! It is a little bit dusty, but it will do the trick! Here, take these as proof of my gratitude.", "gravediggersayleros2", false);

        //Wrath of the Mummy
        addSound("[1/6] Ormrod: Uh, you shouldn't have come here!", "wrathofthemummyormrod1", false);
        addSound("[1/6] Achper: If I know about mummies? Of course! I've spent my entire life studying them!", "wrathofthemummyachper", false);
        addSound("[1/3] Bandit: Hey, what are you doing? If you're trying to loot the tomb, me and the other Creden Tibus already beat you to it.", "wrathofthemummybandit1", false);
        addSound("[1/4] Bandit: Well, whaddya know? You got some Pink Wool! Okay, hand it here and I'll look the other way and let you into the tomb.", "wrathofthemummybandit2", false);
        addSound("[1/4] Ormrod: Uh, hello again... What are those bandages?", "wrathofthemummyormrod2", false);

        //Corrupted village
        //FIX TYPO WYNNN!!
        addSound("[1/17] Roy: Well, that did the trick. Let’s take a look.", "corruptedviallgeroy", false);
        addSound("[1/7] Orikal: Go away! I know you're angry but there's nothing to gain her-", "corruptedviallgeorikal1", false);
        addSound("[1/6] Orikal: That was quick... did you find anything?", "corruptedviallgeorikal2", false);
        addSound("[1/5] Orikal: Okay. I happen to know a recipe for creating an extremely lethal magical explosive.", "corruptedviallgeorikal3", false);
        addSound("[1/3] Orikal: You got 'em all! Excellent, this is exactly what we need.", "corruptedviallgeorikal4", false);
        addSound("[1/4] Orikal: Oh, do you feel that? It's like a buzzing in my ears I never knew about has just vanished.", "corruptedviallgeorikal5", false);
        addSound("[1/3] Alfonse: This is insane, why are we here?! We're looking for corruption you know that right?", "corruptedviallgealfonse", true);

        //Ice nations
        addSound("[1/6] Adigard: Welcome traveler, to our humble island...", "icenationsadigard1", false);
        addSound("[1/7] Adigard: I should have expected that. Hallfred was always very greedy...", "icenationsadigard2", false);
        addSound("[1/5] Hallfred: Welcome traveler! What brings you on our island?", "icenationshallfred1", false);
        addSound("[1/4] Hallfred: Incredible! He actually delivered the treasure!", "icenationshallfred2", false);

        //Lost Royalty
        addSound("[1/5] Yavlis: Oh, hello there! I had hoped not to bother you, adventurer, but this is urgent.", "lostroyaltyyalvis1", false);
        addSound("[1/5] Yavlis: Ah, finally! You're back. Did they let you bring him back? Those mercenaries have an awful habit of failing to honour their deals.", "lostroyaltyyalvis2", false);
        addSound("[1/7] Mercenary Leader: Excuse me?! What are you doing here, how did you find our secret hideout?", "lostroyaltymercenary1", false);
        addSound("[1/3] Mercenary Leader: You've gotten the talisman! I can't believe you actually got through that puzzle!", "lostroyaltymercenary2", false);
        addSound("[1/4] Prince of Troms: Uh... Hi? Err, why did you free me? I'm trying to run away, I hate being the son of the king.", "lostroyaltykingsson", false);

        //Wynn Excavation site A
        addSound("[1/4] Vade: Oh, hey kid. Wanna make some money?", "wynnexcvationavade1", false);
        addSound("[1/8] Tesha: Hello, welcome to WynnExcavation Labs!", "wynnexcvationatesha", false);
        addSound("[1/6] Vade: Who are you?", "wynnexcvationavade2", false);
        addSound("[1/4] Vade: Hey kid, did you just come from the tomb?", "wynnexcvationavade3", false);

        //Wynn Excavation site B
        addSound("[1/1] Flendar: We know what you stole from us in the desert! Take THIS! You won't be escaping this dead end any time soon!", "wynnexcvationbflendar", true);
        addSound("[1/6] Excavator Lykron: Good day! You're the person that helped us out in the desert aren't you? Excellent! Just the person I need! Can you help me out with a problem I have?", "wynnexcvationblykron1", false);
        addSound("[1/5] Excavator Lykron: I have to admit, I'm impressed. I genuinely thought our plan would be successful. Who knew that dead end had a secret exit.", "wynnexcvationblykron2", false);
        addSound("[1/7] WynnExcavation Archaeologist: Baffling... What a puzzling situation I am in...", "wynnexcvationbarchaeologist", false);

        //Wynn Excavation site C
        addSound("[1/8] Excavator Placardus: All operations functional… Transportation on schedule… Oh. It's you. We've been looking for you.", "wynnexcavationcplacardus1", false);
        addSound("[1/7] Excavator Placardus: You couldn't just take my polite word and leave it at that, could you?", "wynnexcavationcplacardus2", false);
        addSound("[1/3] Guard Klerodor: I'm sorry. This is a private meeting.", "wynnexcavationcguard", false);
        addSound("[1/4] Chief Excavator Dranfor: Hello and welcome, senior members of Wynn Excavation Site C. May the dark's gaze forever watch over us. I want to update you on our progress thus far. The fire relic crystal has been largely intact in the heart of the volcano for many years.", "wynnexcavationcdranfor1", true);
        addSound("[1/1] Chief Excavator Dranfor: The alarm has been set off! There is an unauthorized guest! Guards, seize them!", "wynnexcavationcdranfor2", true);
        addSound("[1/10] ???: You. You are the one they are worried about.", "wynnexcavationcamadel", false);

        //Wynn Excavation Site D
        addSound("[1/8] Royal Advisor Carlos: His majesty Lord King of Troms is indisposed at this moment.", "wynnexcavationcarlos1", false);
        addSound("[1/1] Royal Advisor Carlos: Oh my, a secret passage has opened up beneath the throne! Quickly, head inside!", "wynnexcavationcarlos2", false);
        addSound("[1/9] King of Troms: I am impressed you managed to find me. Someone of my intellect is not normally found when he hasn't the intention of being so.", "wynnexcavationkingoftroms", false);
        addSound("[1/6] Troms Guard: Time is short, so I'll have to spare you the details, but let's just say I'm on your side.", "wynnexcavationtromsguard", false);
        addSound("[1/4] ???: Hey, psst. Come here!", "wynnexcavationquestionmark", false);
        addSound("[1/4] Traitor Thomas: I'm sorry, I can't let you in there.", "wynnexcavationthomas1", false);
        addSound("[1/4] Traitor Thomas: Is that… The map fragments? You found them!", "wynnexcavationthomas2", false);
        addSound("[1/8] Traitor Amadel: Welcome, friend. I knew you would figure it all out.", "wynnexcavationamadel1", false);
        addSound("[1/1] Traitor Buice: WynnExcavation have done really horrible things, and I used to help...", "wynnexcavationbucie", false);
        addSound("[1/1] Traitor Jaynar: WynnExcavation will be destroyed, no matter what!", "wynnexcavationjaynar", false);
        addSound("[1/8] Excavator Admin Uci: Oh my. It's you. I can't say I'm surprised to see you, we thought you might be stupid enough to come here.", "wynnexcavationadminuc", false);
        addSound("[1/1] Excavator Sean: My boss Uci is a bit of a mean guy, but hey the perks of minionship aren't bad!", "wynnexcavationsean", false);
        addSound("[1/1] WynnExcavation Scientist Azure: This leads deeper into this dungeon, but it seems like it has to be activated from the other side", "wynnexcavationazure", false);
        addSound("[1/8] WynnExcavation Leader Amadel: Well, well. Looks like you've finally made it.", "wynnexcavationamadel2", false);
        addSound("[1/1] WynnExcavation Leader Amadel: Step into this hole, and accept your fate. It's over, you've lost!", "wynnexcavationamadel3", false);
        addSound("[1/2] Amadel's Assistant: I see you have finally shown up.", "wynnexcavationassistant1", false);
        addSound("[1/2] Amadel's Assistant: That was a mere fluke..", "wynnexcavationassistant2", false);
        addSound("[1/2] Amadel's Assistant: He's simply warming up...", "wynnexcavationassistant3", false);
        addSound("[1/2] Amadel's Assistant: I, I can't believe you beat him...", "wynnexcavationassistant4", false);
        addSound("[1/18] Ragni's King: You... hmm... Ahh yes! I remember you. You're one of the recruits I accepted long ago..", "wynnexcavationragnisking", false);
        addSound("[1/1] Corrupted Amadel: The crystals combine the power of the stars themselves.. an ultimate power... the power to reign over the entire WORLD!", "wynnexcavationamadel4", true);
        addSound("[1/1] Shadow Amadel: I- I- I feel... unstopable.. this power... will not allow me to lose..!!!", "wynnexcavationamadel5", true);
        addSound("[1/1] Amadel: DID YOU REALLY THINK YOU COULD WIN?!?! YOU ARE NOTHING COMPARED TO ME! NOTHING!! I WILL EXTERMINATE ALL LIFE, STARTING WITH YOU!! NOW, PERISH!!!", "wynnexcavationamadel6", true);

        //Mushroom man
        addSound("[1/6] Yahya: G-... Hi! What a coincidence, I... I actually need you, yes.", "mushroomman1", false);
        addSound("[1/3] Yahya: Oh, it's you. What? I can't just have one? I-... I'm pretty sure I need a few more than that.", "mushroomman2two", false);
        addSound("[1/5] Yahya: You, again? Oh, you have the.. mushrooms.", "mushroomman3three", false);
        addSound("[1/6] Yahya: H-...Hey! I didn't expected you to find it... Haha... Um...", "mushroomman4four", false);

        //Cluck Cluck
        addSound("[1/6] Nohno: Hey, you aren't a chicken! Wait, you're a human! You can help me! Maybe you are the guy who helped my brother Yahya, but who knows, you humans all look the same to me.", "cluckclucknohno1", false);
        addSound("[1/2] Nohno: What is this?! His feather? What did you do to Cluckles?! I wanted you to take care of him, not kill him!", "cluckclucknohno2", false);

        //Infested Plants
        addSound("[1/5] Ope: Hello! Young traveler.", "infplants1", false);
        addSound("[1/3] Ope: I've literally been sitting here for hours, maybe not hours, at least five minutes!", "infplants2", false);

        //Enzans Brother
        addSound("[1/6] Therck: Excuse me? Can't you see I'm busy?", "enzansbrothertherck1", false);
        addSound("[1/7] Therck: Ah, you're back! Do you have the mushroom?", "enzansbrothertherck2", false);
        addSound("[1/5] Enzan: I see you want to venture into the wilderness!", "enzansbrotherenzan", false);

        //Reincarnation
        addSound("[2/9] Bob: I am Bob, master of the arts of Wynn.", "reincarnationbob", true);
        addSound("[1/13] Batelu: Hello adventurer! I see you want to solve the mystery of Bob's tomb also? Glad to meet you.", "reincarnationbatleu1", false);
        addSound("[1/2] Batelu: Wonderful! We can now open the passage to the true tomb of Bob...", "reincarnationbatleu2", false);
        addSound("[1/5] Batelu: Bob's Seal of Approval? Oh my goodness!", "reincarnationbatleu3", false);

        //Bobs lost soul
        addSound("[1/10] Wedyf: Welcome traveler. Are you looking for something?", "bobslostsoulwedyf1", false);
        addSound("[1/6] Wedyf: Great, you got everything.", "bobslostsoulwedyf2", false);
        addSound("[1/6] Wedyf: I'm glad to see you again.", "bobslostsoulwedyf3", false);
        addSound("[1/6] The Blacksmith: What can I do for ya?", "bobslostsoulblacksmith1", false);
        addSound("[1/4] The Blacksmith: ... Hi again. I see you got the weapons.", "bobslostsoulblacksmith2", false);
        addSound("[1/9] Tarod: You're one of those soldier types, right? My name is Tarod, and I could really use your assistance here.", "bobslostsouldtarod1", false);
        addSound("[1/6] Tarod: Welcome back. Did you find anything worthwhile?", "bobslostsouldtarod2", false);
        addSound("[1/3] Tarod: You're back... Has he... has he finally been put to rest?", "bobslostsouldtarod3", false);
        addSound("[1/6] Apprentice: Weapons of the depressed kind? Oh, of course, of course, I know of the set! Around Nesaak, I hear they are kept.", "bobslostsoulapprentice1-1", false);
        addSound("[2/6] Apprentice: An army of Linx you must clear, in a cave you shall find this spear!", "bobslostsoulapprentice1-2", false);
        addSound("[3/6] Apprentice: To a skilled archer you must go, best her in a lumberyard and you will have her bow!", "bobslostsoulapprentice1-3", false);
        addSound("[4/6] Apprentice: On an altar, effervescence leers, complete the sacrifice and you will gain your shears...", "bobslostsoulapprentice1-4", false);
        addSound("[5/6] Apprentice: In the forest, a house frozen in spikes thick, outsmart the contraption and be gifted a stick!", "bobslostsoulapprentice1-5", false);
        addSound("[6/6] Apprentice: But beware, beware! Danger lies ahead, and will try to halt you in your stead!", "bobslostsoulapprentice1-6", false);

        //Temple of Legends
        addSound("[1/10] Garull: GWUH! Oh god, don't scare me like that! Who... Who even are you?!", "templeoflegendsgarull1", false);
        addSound("[1/4] Garull: Thank you for listening to me about not being so quiet coming over here. I'm guessing you've got everything?", "templeoflegendsgarull2", false);
        addSound("[1/6] Jorkin: You may want to get out of here, traveller. The Nether is very dangerous!", "templeoflegendsjorkin1", false);
        addSound("[1/7] Jorkin: You have the Light Dust, then? Hand it here, I want to see something.", "templeoflegendsjorkin2", false);
        addSound("[1/5] Kelight: I see you want to enter this mighty temple! Do not deny it, I see it in your eyes.", "templeoflegendskelight1", false);
        addSound("[1/6] Kelight: Mhm, mhm. Yeah, that was a bit fast. Fork them over, I need to see if these are the real deal.", "templeoflegendskelight2", false);
        addSound("[1/10] Kelight: Back so soon? A little bit suspicious. Allow me to examine your trophies once more.", "templeoflegendskelight3", false);
        addSound("[1/6] Kelight: Hah. Took you long enough. This is the light dust, I presume?", "templeoflegendskelight4", false);
        addSound("[1/4] Kelight: Oh, so you actually managed to find the blighter. I was getting tired of waiting for you.", "templeoflegendskelight5", false);
        addSound("[1/4] Kelight: .. You... you did it? H-how?!", "templeoflegendskelight6", false);
        addSound("[1/6] Rayshyroth: Oh? Well, greetings. What brings you to our quiet lonely island, let alone all the way up here?", "templeoflegendsrayshyroth1", false);
        addSound("[1/9] Rayshyroth: Aha, you're back with the Sky Vapor! Sorry about the climb, even I find it rather inconvenient at times.", "templeoflegendsrayshyroth2", false);

        //Cook Assistant
        addSound("[1/4] The Cook: I can't believe what is happening to me!", "cookassistant1", false);
        addSound("[1/3] The Cook: Great! You got all the ingredients!", "cookassistant2", false);

        //Clearing the Camps
        addSound("[1/6] Captain Kymer: Aha, another Ragni soldier, eh? Well, a warm welcome to you.", "clearingthecampskymer1", false);
        addSound("[1/5] Captain Kymer: Ah, the soldier from earlier! You're back, I see. Any luck defeating those- ...yeesh. Are those their heads?", "clearingthecampskymer2", false);

        //The Sewers Of Ragni
        addSound("[1/4] Jenprest: Soldier! Good timing. We've been requesting help for ages.", "thesewersofragnijenprest1", false);
        addSound("[1/3] Jenprest: Ah you're already here. Coming up behind you soldier!", "thesewersofragnijenprest2", false);
        addSound("[1/3] Jenprest: Do you feel like there's something lurking that doesn't want us here?", "thesewersofragnijenprest3", false);
        //FIX TYPO WYNNN!! NOT WORKING
        addSound("[1/3] Jenprest: Ah, you're alive! Looks like we underestimated the amount of sewage.", "thesewersofragnijenprest4", false);
        addSound("[1/1] Jenprest: Oh no, oh no no no! Did you just open that? Come here immediately.", "thesewersofragnijenprest5", false);
        addSound("[1/6] Jenprest: Oh no...", "thesewersofragnijenprest6", false);
        addSound("[1/1] ???: Release me...", "thesewersofragniquestionmark", false);

        //Decrepit Sewers
        addSound("[1/1] ???: You dare enter these sewers, human? These pipes once hid the civilians of Ragni during raids... Now it just holds corpses.", "decriptsewerswitherehead1", true);
        addSound("[1/1] ???: The forces of the Humans could not save me when I hid here, and they can't save you either.", "decriptsewerswitherehead2", true);
        addSound("[1/1] Witherhead: You persist through the sludge, now you will join me like the rest!", "decriptsewerswitherehead3", true);

        //Star Thief
        addSound("[1/1] ???: It's... mine.", "starthiefthief1", true);
        addSound("[1/1] Thief: .... I can't control myself...fjfjfj This rock...", "starthiefthief2", true);
        //NOT WORKING
        addSound("[1/2] Thief: What is... this feeling… No I won't listen..", "starthiefthief3", false);
        addSound("[1/5] Agent: Hey you! Human. What are you doing here?", "starthiefagent1", false);
        addSound("[1/4] Agent: Hello again. Did you find the meteor down there? Why on earth are you holding some?!", "starthiefagent2", false);

        //Arachnids Ascent
        addSound("[1/8] Enduyn: At ease, soldier! Good timing. We need more manpower.", "archnidsascentenduyn1", false);
        addSound("[1/4] Enduyn: Ah perfect! Now give me that bucket.", "archnidsascentenduyn2", false);

        //The house of twain
        addSound("[1/10] Twendle: Oh, hey you there! Are you heading down this road? You know it's a dead end, right?", "thehouseoftwaintwendle1", false);
        addSound("[1/2] Twendle: I guess I put my faith in the right person. My history lies within these pages, and I don't intend to keep them secret. I shall make them public.", "thehouseoftwaintwendle2", false);

        //One Thousand Meters Under
        addSound("[1/3] The Secretary: Hello, welcome to Ynnos' facility.", "onethousandmetersundersecretary", false);
        addSound("[1/11] Scientist Ynnos: *Ahem* Welcome, everyone.", "onethousandmetersunderscientistyvnoss1", false);
        addSound("[1/10] Scientist Ynnos: You survived! Where is everyone else?", "onethousandmetersunderscientistyvnoss2", false);
        addSound("[1/2] Arlene: I wonder what the mechanic is doing?", "onethousandmetersunderarlene1", false);
        addSound("[1/2] Kantor: Attention crew members.", "onethousandmetersunderkantor1", true);
        addSound("[1/2] Kantor: Thank you so much! I thought we would all die before the mission even started!", "onethousandmetersunderkantor2", false);
        addSound("[1/1] Kantor: Ah! finally! Line up the white rope with the blue blocks. I need to control things from here. Push those blocks into line so we won't just fall down!", "onethousandmetersunderkantor3", false);
        addSound("[1/1] Captain Olof: We have encountered our first island, 100m down. Crew members, climb up the ladder and search the island for the crystal.", "onethousandmetersunderolof1", true);
        addSound("[1/3] Captain Olof: We've arrived at the next void island.", "onethousandmetersunderolof2", false);
        addSound("[1/3] Captain Olof What are these creatures!", "onethousandmetersunderolof3", true);
        addSound("[1/1] Captain Olof: Don't let the creatures break through glass! Press against it and scare them off!", "onethousandmetersunderolof4", false);
        addSound("[1/3] Captain Olof: This is not good, the creatures destroyed part of the windshield.", "onethousandmetersunderolof5", false);
        addSound("[1/2] Captain: Attention crew. We have arrived at the second island, 300m down. We cannot progress without making some emergency repairs.", "onethousandmetersunderolof6", true);
        addSound("[1/5] Captain Olof: We need to repair the submarine.", "onethousandmetersunderolof7", false);
        addSound("[1/3] Captain Olof: Ech! What is this stuff? Well, this should do the trick.", "onethousandmetersunderolof8", false);
        addSound("[1/6] Jesp: Oh, blast! Do you smell that?", "onethousandmetersunderjesp1", true);
        addSound("[1/3] Captain Olof: Attention crew. We have arrived at the next island 700m down.", "onethousandmetersunderolof9", true);
        addSound("[1/5] Rex: We got this, just take care of the monsters while we build the bridge!", "onethousandmetersunderrex1", true);
        addSound("[2/5] Manny: Dont die! We're soon done.", "onethousandmetersundermanny1", true);
        addSound("[3/5] Jesp: This is hard, but we'll make it!", "onethousandmetersunderjesp2", true);
        addSound("[4/5] Arlene: Be careful, it seems to be getting tougher. The bridge is soon ready to use.", "onethousandmetersunderarlene2", true);
        addSound("[5/5] Manny: Hey, the bridge is ready!", "onethousandmetersundermanny2", true);
        addSound("[1/4] Rex: We didn't find the crystal here either. Maybe it just fell in the void?", "onethousandmetersunderrex2", true);
        addSound("[1/13] Celuuse: Whoooooooo are you!?", "onethousandmetersunderceluuse", true);
        addSound("[1/8] Rontaid: WHAT...WHO...Humans in the void!?", "onethousandmetersunderrontaid", true);

        //Recipe for disaster
        addSound("[1/4] Frank: How are ya? Hamsey said you're an old buddy of his, helped him while he was still in Ragni.", "recipefordisastefrank1", false);
        addSound("[1/9] Frank: So you decided to work with me, huh? I promise I won't dissapoint.", "recipefordisastefrank2", false);
        addSound("[1/2] Frank: Well done on getting them items, some of 'em are pretty tough to find!", "recipefordisastefrank3", false);
        addSound("[1/5] Brie: Heya! You must be the adventurer that Hamsey told me about. You know, he was almost ecstatic, but don't tell him I said that!", "recipefordisasterbrie1", false);
        addSound("[1/8] Brie: Heya again! So you decided to make the Zork Stew with me? Hurray!", "recipefordisasterbrie2", false);
        addSound("[1/2] Brie: Oh my gosh, you came back! You were gone for quite a while and I started getting worried about you!", "recipefordisasterbrie3", false);
        addSound("[1/5] Kale: When Hamsey told me about a good friend of his, I didn't expect... this.", "recipefordiasterkale1", false);
        addSound("[1/7] Kale: When Hamsey told me about a good friend of his, I didn't expect... this.", "recipefordiasterkale2", false);
        addSound("[1/3] Kale: Oh, it's you again. You got the ingredients... it's about time!", "recipefordiasterkale3", false);
        addSound("[1/8] Chef Hamsey: Bonjour, let me take you to your seat, monsieu..mada-this way!", "recipefordisasterhamsey1", false);
        addSound("[1/7] Chef Hamsey: Welcome to ma cuisine! C'est beau, non?", "recipefordisasterhamsey2", false);
        addSound("[1/4] Chef Hamsey: Welcome back, mon ami! I see you've return with a dish in hand!", "recipefordisasterhamsey3", false);
        addSound("[1/4] Chef Hamsey: I cannot help but notice that your dish is ready!", "recipefordisasterhamsey4", false);
        addSound("[1/4] Chef Hamsey: I see you've returned, and not empty handed. Please, show me what you've created!", "recipefordisasterhamsey5", false);
        addSound("[1/9] Talking Mushroom: ISN'T THIS JUST ABSOLUTELY FANTASTIC. A HUMAN?! WHO WOULD HAVE GUESSED.", "recipefordisastertalkingmushroom", false);

        //Beyond the Grave
        addSound("[1/4] Death: IT SEEMS I HAVE A NEW GUEST. WELCOME.", "beyondthegravedeath1", true);
        addSound("[1/3] Death: I SUGGEST YOU DON'T EAT ANYTHING THAT YOU ARE SERVED HERE, I HEARD IT IS TO DIE FOR.", "beyondthegravedeath2", false);
        addSound("[1/2] Death: THIS IS AN EMPTY ROOM.", "beyondthegravedeath3", false);
        addSound("[1/1] Death: FEET OFF THE TABLE PLEASE.", "beyondthegravedeath4", false);
        addSound("[1/3] Death: THIS IS THE LIBRARY, WHERE MY GUESTS COME TO SPEND THEIR TIME.", "beyondthegravedeath5", false);
        addSound("[1/4] Death: IT SEEMS YOU REALLY WANTED TO KNOW WHAT WAS BEHIND THIS DOOR.", "beyondthegravedeath6", false);
        addSound("[1/2] Death: ANOTHER DOOR.", "beyondthegravedeath7", false);
        addSound("[1/4] Death: THESE HOURGLASSES SHOW THE LIFESPAN OF HUMANS. WHEN ALL THE SAND HITS THE BOTTOM, I GET A NEW GUEST.", "beyondthegravedeath8", false);
        addSound("[1/1] Death: IF ANYONE ASKS, YES, I AM MARRIED. JUST BECAUSE I DON'T HAVE A HEART DOESN'T MEAN THAT I CAN'T LOVE.", "beyondthegravedeath9", false);
        addSound("[1/4] Death: THIS IS MY OFFICE. GUESS WHAT I DO HERE. HUH?", "beyondthegravedeath10", false);
        addSound("[1/14] Death: I KNOW THIS SEEMS LIKE AN ODD PLACE TO BE. SITTING IN FRONT OF DEATH.", "beyondthegravedeath11", false);
        addSound("[1/2] Death: SOMETHING I'M FINDING INCREASINGLY ANNOYING IS HOW MANY PEOPLE ARE FINDING WAYS TO BECOME IMMORTAL NOWADAYS. INTELLIGENT COMPANY IS STARTING TO GET A BIT SCARCER.", "beyondthegravedeath12", false);
        addSound("[1/5] Death: WELL, I SEE YOU ARE LEAVING.", "beyondthegravedeath13", true);
        addSound("[1/1] Death: STAY AWAY FROM THAT ROOM. IT'S NOT GOOD FOR EITHER OF US.", "beyondthegravedeath14", true);
        addSound("[1/7] Irlok: Welcome to Bantisu Temple. We guide adventuring souls onwards.", "beyondthegraveirlok1", false);
        addSound("[1/5] Irlok: Oh, you've returned. I must admit, I'm very impressed.", "beyondthegraveirlok2", false);

        //Blazing retribution
        addSound("[1/10] Detective Jackson: How can I go about this...? I can't get involved myself, and they won't let me near... Wait, a human?", "blazingretributiondetectivejackson1", false);
        addSound("[1/9] Detective Jackson: I see no axe in your hands, so I should assume neither Sablestone or Loamsprout had it.", "blazingretributiondetectivejackson2", false);
        addSound("[1/4] Detective Jackson: That looks like the axe of Llevigar to me! Blue finish, hot to the touch- well done! What Orc boss had stolen it?", "blazingretributiondetectivejackson3", false);
        addSound("[1/1] ???: GRRRH!! What 'Uthniiazek' mean?!", "blazingretributiongreggr1", true);
        addSound("[1/1] Gregg'r: Uthniiazek! Uthniiazek!! WHY NO LISTEN TO GREGG'R?", "blazingretributiongreggr2", true);
        addSound("[1/3] Gregg'r: Stupid Villager magic thing! Why fire no listen?", "blazingretributiongreggr3", true);
        addSound("[1/7] Piere: Oh sweet baby bovine, my house, what am I going to do? Wait, who are you?", "blazingretributionpiere", false);

        //Potion Making
        addSound("[1/4] Dr. Essren: Ah, you must be the one my assistant told me about.", "potionmakingdressren", true);
        addSound("[1/5] The Assistant: Heeh...stranger. I...may need your assistance...", "potionmakingassistant1", false);
        addSound("[1/5] The Assistant: Good...good. You have the mushrooms.", "potionmakingassistant2", false);
        addSound("[1/3] The Assistant: I...must thank you, stranger...", "potionmakingassistant3", false);

        //Underwater
        addSound("[1/6] Sayrr: Why ya looking at me like that? Is it cause I'm small, eh? I'll have you know that I caught fish that were twice your size!", "underwatersayrr1", false);
        addSound("[1/2] Sayrr: Ah! Welcome back! Any luck with the fish?", "underwatersayrr2", false);
        addSound("[1/9] Omango: Hi, my name is Omango. I am a resident of the Maltic village, on top of the hill.", "underwateromango1", false);
        addSound("[1/2] Omango: You got it! You found the treasure!", "underwateromango2", false);

        //Elemental Exercise
        addSound("[1/7] Ragon: Ah! Finally! I've been waiting for a recruit like yourself to turn up.", "elementalexercise-ragon-1", false);
        addSound("[1/4] Ragon: Interesting, it completely destroyed the beast. It seems our theories might be correct.", "elementalexercise-ragon-2", false);
        addSound("[1/1] Ragon: Hey, wake up.", "elementalexercise-ragon-3", true);
        addSound("[1/3] Ragon: Is everything alright? We felt the cave collapse! We came down as soon as possible!", "elementalexercise-ragon-4", true);
        addSound("[1/1] Ragon: Good to see you made it out, would you mind giving your fire weapon back to Suri and then bring me his study results?", "elementalexercise-ragon-5", false);
        addSound("[1/6] Ragon: Thank you, I guess you can use this, it's not a lot but we are not the richest scientists around, sorry for all the trouble we put you through.", "elementalexercise-ragon-6", false);

        //Dwelling Walls
        addSound("[1/10] Leucsaa: Let's see here... mother's old vase… check!", "dwellingwalls-leucsaa-1", false);
        addSound("[1/3] Leucsaa: The journal! You outsmarted the mansion!", "dwellingwalls-leucsaa-2", false);

        //Deja Vu
        addSound("[1/6] Asher: Well well well, look who decided to come back with their tail between their legs.", "dejavu-asher-1", false);
        addSound("[2/6] Asher: Two weeks now and you still haven't found it? Ugh, I can't believe I ever trusted you with such a simple task.", "dejavu-asher-2", false);
        addSound("[3/6] Asher: Who am I? WHAT DO YOU MEAN WHO AM I? You offered to help find my shovel, and I've been waiting two weeks!", "dejavu-asher-3", false);
        addSound("[4/6] Asher: Forget about your payment. Unless you either pay me back or get my shovel right now!", "dejavu-asher-4", false);
        addSound("[5/6] Asher: My shovel? That's why I sent you out in the first place! It's somewhere in Time Valley. I lost it while following a trail of flowers.", "dejavu-asher-5", false);
        addSound("[6/6] Asher: I think it was south west of the large ruined gate. Now go get it!", "dejavu-asher-6", false);
        addSound("[1/7] Asher: Well hello there, stranger! Welcome to Time Valley! Always nice to see a new face around here.", "dejavu-asher-7", false);
        addSound("[2/7] Asher: Mad at you? Why would I be mad at you? We've never met.", "dejavu-asher-8", false);
        addSound("[3/7] Asher: I know this a bit forward, but I need to ask for your help with-", "dejavu-asher-9", false);
        addSound("[4/7] Asher: Wait, is that-? It is! You've found my shovel! I recognize those markings anywhere.", "dejavu-asher-10", false);
        addSound("[5/7] Asher: But why is it so rusty? Ah, no matter. Give that to me and I'll head inside to get you a nice reward.", "dejavu-asher-11", false);
        addSound("[6/7] Asher: Thank you. Now, about that reward-", "dejavu-asher-12", false);
        addSound("[7/7] Asher: Wha- What's happening?", "dejavu-asher-13", false);
        addSound("[1/18] Asher: Huh? Where is everyone?", "dejavu-asher-14", true);
        addSound("[2/18] Asher: Usually this place is filled with workers.", "dejavu-asher-15", true);
        addSound("[3/18] Asher: But no one's here. And this place is clearly not done.", "dejavu-asher-16", true);
        addSound("[4/18] Asher: Whatever the case, I should probably find my shovel.", "dejavu-asher-17", true);
        addSound("[5/18] Asher: If I were a shovel, where would I be?", "dejavu-asher-50", true);
        addSound("[6/18] Asher: Hmmm. Not around here.", "dejavu-asher-18", true);
        addSound("[1/1] Asher: Wait, what's that-?", "dejavu-asher-19", true);
        addSound("[7/18] Asher: This place... There's so much going on but no one here.", "dejavu-asher-20", true);
        addSound("[8/18] Asher: What I don't understand, though, is why this place looks brand new.", "dejavu-asher-21", true);
        addSound("[9/18] Asher: This place looks like it's just being built!", "dejavu-asher-22", true);
        addSound("[10/18] Asher: This must be something to do with the valley's magic. Wouldn't be the first time.", "dejavu-asher-23", true);
        addSound("[11/18] Asher: Heh, time.", "dejavu-asher-25", true);
        addSound("[1/1] Asher: Woah! Where did-?", "dejavu-asher-26", true);
        addSound("[12/18] Asher: In fact, whenever I hold that shovel, this kind of stuff seems to happen.", "dejavu-asher-27", true);
        addSound("[13/18] Asher: Maybe it's sent me way back. Back to the construction of this place.", "dejavu-asher-28", true);
        addSound("[14/18] Asher: Then why is no one here?", "dejavu-asher-29", true);
        addSound("[15/18] Asher: Woah, that tree looks like it might fall over!", "dejavu-asher-30", true);
        addSound("[16/18] Asher: That was a close one!", "dejavu-asher-31", true);
        addSound("[17/18] Asher: Uhf! How do they have a cannon? These guys must be super advanced.", "dejavu-asher-32", true);
        addSound("[18/18] Asher: I think I'm close now. I can just feel that shovel close by.", "dejavu-asher-33", true);
        addSound("[1/11] Asher: Oh there it is! My shovel!", "dejavu-asher-34", true);
        addSound("[2/11] Asher: I'm surprised it took me back this far this time.", "dejavu-asher-35", true);
        addSound("[3/11] Asher: Well, time to head on back-", "dejavu-asher-36", true);
        addSound("[4/11] Asher: Wait, Martyn?", "dejavu-asher-37", true);
        addSound("[5/11] Asher: Ow! What was that for?", "dejavu-asher-38", true);
        addSound("[7/11] Asher: I... Might recall it.", "dejavu-asher-39", true);
        addSound("[9/11] Asher: Oh... So that's where I am. I am so sorry Martyn. Please don't kick me out of the valley.", "dejavu-asher-40", true);
        addSound("[1/14] Asher: Holy Bovine!", "dejavu-asher-41", true);
        addSound("[3/14] Asher: How did you get these powers? Are you even human?", "dejavu-asher-42", false);
        addSound("[6/14] Asher: I probably could have gotten myself out...", "dejavu-asher-43", false);
        addSound("[8/14] Asher: I did?", "dejavu-asher-44", false);
        addSound("[12/14] Asher: Uh, you're still here.", "dejavu-asher-45", false);
        addSound("[14/14] Asher: I don't understand Martyn. He seems to know everything about the past. Here, come closer, I want to whisper something.", "dejavu-asher-46", false);
        addSound("[1/3] Asher: I think he might have known Bob. I saw some letters in his house.", "dejavu-asher-47", false);
        addSound("[2/3] Asher: Weird, right? Bob was a hard guy to know.", "dejavu-asher-48", false);
        addSound("[3/3] Asher: Anyway, take this. It's the least I can do to pay you for saving me.", "dejavu-asher-49", false);
        addSound("[1/3] Old Man Martyn: Oh dear, there he goes again. Poor fool ignored my warnings and touched that shovel.", "dejavu-oldmanmartyn-1", false);
        addSound("[2/3] Old Man Martyn: He's gone and got himself stuck in a loop", "dejavu-oldmanmartyn-2", false);
        addSound("[3/3] Old Man Martyn: Head inside, soldier, and I'll explain what's happening here.", "dejavu-oldmanmartyn-3", false);
        addSound("[1/8] Old Man Martyn: Let me explain why Asher disappeared...", "dejavu-oldmanmartyn-4", false);
        addSound("[2/8] Old Man Martyn: Time Valley was built many years ago by a long-lost civilization.", "dejavu-oldmanmartyn-5", false);
        addSound("[3/8] Old Man Martyn: They had odd powers. They ended up distorting time itself.", "dejavu-oldmanmartyn-6", false);
        addSound("[4/8] Old Man Martyn: The tools they used to make these structures are imbued with their power.", "dejavu-oldmanmartyn-7", false);
        addSound("[5/8] Old Man Martyn: Asher found one of these tools: the shovel.", "dejavu-oldmanmartyn-8", false);
        addSound("[6/8] Old Man Martyn: The shovel is tethering its time of influence to today. It keeps sending Asher back.", "dejavu-oldmanmartyn-9", false);
        addSound("[7/8] Old Man Martyn: The issue is, Asher died in the past. This creates a paradox.", "dejavu-oldmanmartyn-10", false);
        addSound("[8/8] Old Man Martyn: We can save him if I send you back to prevent his death. Go through this rift to join him in the past.", "dejavu-oldmanmartyn-11", false);
        addSound("[6/11] Old Man Martyn: Asher, you remember when I allowed you to live in the valley, I told you not to touch any odd objects.", "dejavu-oldmanmartyn-12", false);
        addSound("[8/11] Old Man Martyn: You got yourself stuck hundreds of years ago. If it wasn't for this guard, you'd be removed from existence.", "dejavu-oldmanmartyn-13", false);
        addSound("[10/11] Old Man Martyn: I know time travel can be tempting. But it's far more dangerous than you can ever understand.", "dejavu-oldmanmartyn-14", false);
        addSound("[11/11] Old Man Martyn: The valley is banned for most citizens. I watch over this timeline because of poor souls like Asher", "dejavu-oldmanmartyn-15", false);
        addSound("[2/14] Old Man Martyn: Ah, we're back.", "dejavu-oldmanmartyn-16", false);
        addSound("[4/14] Old Man Martyn: Oh you know. I've read a book or two in my time.", "dejavu-oldmanmartyn-17", false);
        addSound("[5/14] Old Man Martyn: Soldier, I'm sorry I got you dragged into this. I wish I could have done it myself.", "dejavu-oldmanmartyn-18", false);
        addSound("[7/14] Old Man Martyn: You died in the past. Multiple times.", "dejavu-oldmanmartyn-19", false);
        addSound("[9/14] Old Man Martyn: Yes. In some surprising ways too.", "dejavu-oldmanmartyn-20", false);
        addSound("[10/14] Old Man Martyn: Soldier, I'm sure we will meet again... in time.", "dejavu-oldmanmartyn-21", false);
        addSound("[11/14] Old Man Martyn: See you around.", "dejavu-oldmanmartyn-22", false);
        addSound("[13/14] Old Man Martyn: Am I?", "dejavu-oldmanmartyn-23", false);
        addSound("[1/1] Old Man Martyn: Without Asher, his house has vanished from time.", "dejavu-oldmanmartyn-24", true);
        addSound("[1/2] Old Man Martyn: My my, a crushing defeat to be sure. You'll have to find a way to stop that.", "dejavu-oldmanmartyn-25", false);
        addSound("[2/2] Old Man Martyn: Go back through the rift and make sure Asher doesn't become a pancake this time.", "dejavu-oldmanmartyn-26", false);
        addSound("[1/2] Old Man Martyn: Well that was quite the explosive end to our friend there. There must be a way to prevent that.", "dejavu-oldmanmartyn-27", false);
        addSound("[2/2] Old Man Martyn: Head back in there. This time with less explosions", "dejavu-oldmanmartyn-28", false);
        addSound("[1/2] Old Man Martyn: Oh, so close on that try. Who could've guessed that was how our friend met his end?", "dejavu-oldmanmartyn-29", false);
        addSound("[2/2] Old Man Martyn: I'm sure you'll nail it this time. Not sure how you will stop a cosmic event, though.", "dejavu-oldmanmartyn-30", false);

        //Macabre Masquerade Hallowynn 2014
        addSound("[1/5] Mask Salesman: Hmm... Let's see, wha- Ah! Oh, pardon me, I was distracted. Luckily you're here, because I require some assistance.", "macabremasquerade-masksalesman-1", false);
        addSound("[2/5] Mask Salesman: You see, I was just on my way back from that large mansion near Nesaak, where I went to acquire some antiques from an old business partner.", "macabremasquerade-masksalesman-2", false);
        addSound("[3/5] Mask Salesman: However, along the way, a valuable cursed mask escaped from my caravan and somehow made its way into the dark mine over there!", "macabremasquerade-masksalesman-3", false);
        addSound("[4/5] Mask Salesman: I would've gone after it, but the things I have in this caravan are too important to leave by themselves. Not to mention that the cave seemed to corrupt from the inside out...", "macabremasquerade-masksalesman-4", false);
        addSound("[5/5] Mask Salesman: You must help me retrieve the mask, for I must depart in 3 days! Could you brave the shadowy cave and bring it back?", "macabremasquerade-masksalesman-5", false);
        addSound("[1/4] Mask Salesman: You've met a terrible fate, haven't you? I was just about to run the whole way to Nemract to get help.", "macabremasquerade-masksalesman-6", false);
        addSound("[2/4] Mask Salesman: I would really like to hear what you encountered in that cave, but I must prepare to leave, for I have many masks to sell on a far away continent.", "macabremasquerade-masksalesman-7", false);
        addSound("[3/4] Mask Salesman: Maybe you can visit me at some point, if our paths were to ever cross again. Then we could talk about your journey.", "macabremasquerade-masksalesman-8", false);
        addSound("[4/4] Mask Salesman: To thank you for your help, I wanted to give you a special mask, but I'm out of it. Maybe next year?", "macabremasquerade-masksalesman-9", false);

        //Generals Orders
        addSound("[1/6] Tylas: ZZZZZZZZzzzzzzZZZZZzzzzz...", "generalsorders-tylas-1", false);
        addSound("[2/6] Tylas: AAAHHHHH! You startled me! Sleeping? No, you must be mistaken. I have sworn to guard this fort at all costs, I would never even close my eyes!", "generalsorders-tylas-2", false);
        addSound("[3/6] Tylas: The barracks is not currently operating, I'm afraid. General Lecade has all of the men working on all sorts of absolutely ridiculous tasks.", "generalsorders-tylas-3", false);
        addSound("[4/6] Tylas: You wish to help out? That is very kind of you to offer, but I'm not supposed to let anyone through aside from fellow soldiers.", "generalsorders-tylas-4", false);
        addSound("[5/6] Tylas: Then again, General Lecade hasn't been himself lately. It probably won't even bother him if it means getting his work done.", "generalsorders-tylas-5", false);
        addSound("[6/6] Tylas: I'll let you through, if you wish to help. Speak with General Lecade to find out what insane task he wants you to do, his office lies in the central building, just follow this path.", "generalsorders-tylas-6", false);
        addSound("[1/6] Lecade: Who let you in here? Probably that private who I let guard this place, I'll bet that he was sleeping again. So what brings you here, anyways?", "generalsorders-lecade-1-1-6", false);
        addSound("[2/6] Lecade: So, you wanna help me with the work I need done? Sure, why not? I could use an extra hand around here!", "generalsorders-lecade-1-2-6", false);
        addSound("[3/6] Lecade: All right, I need you to get to work straight away! You see... um... I've heard rumors that some of our equipment isn't working well.", "generalsorders-lecade-1-3-6", false);
        addSound("[4/6] Lecade: Some of our cannons and ballistae, actually. You know, quite dangerous, and whatnot.", "generalsorders-lecade-1-4-6", false);
        addSound("[5/6] Lecade: You can find this equipment outside of our main fort. Just follow the path, they're to the right of our blacksmith.", "generalsorders-lecade-1-5-6", false);
        addSound("[6/6] Lecade: Now what are you waiting for? Get to work!", "generalsorders-lecade-1-6-6", false);
        addSound("[1/4] Lecade: You're back already? You're telling me you reached the equipment and came back already? Impossible!", "generalsorders-lecade-2-1-4", false);
        addSound("[2/4] Lecade: I mean, good work, soldier! While you were gone, some more work freed up. You see, I... accidentally dropped my good-luck charm into an aqueduct, it's in the sewers now.", "generalsorders-lecade-2-2-4", false);
        addSound("[3/4] Lecade: That charm brings me luck, you're going to have to dive into the sewers to retrieve it. I do know of a way you can enter them.", "generalsorders-lecade-2-3-4", false);
        addSound("[4/4] Lecade: There's a crack in a pipe on the other side of the fort that you should be able to use to enter the sewers. Now hurry up, standing around won't get me that charm!", "generalsorders-lecade-2-4-4", false);
        addSound("[1/3] Lecade: What's with that gold thing? Oh, yes, my good-luck charm! Good work, soldier! There's yet another task for you, and I think you're fit for the job.", "generalsorders-lecade-3-1-3", false);
        addSound("[2/3] Lecade: There's a mountain near the town that's always looked rather dull to me. I want you to paint it a different color, make it look nice.", "generalsorders-lecade-3-2-3", false);
        addSound("[3/3] Lecade: Yes, how about you paint it purple? I wrote the coordinates down in your quest book, so get to it!", "generalsorders-lecade-3-3-3", false);
        addSound("[1/3] Lecade: You painted the mountain already? I can't believe this! How are you doing everything I order you to so quickly? You should be exhausted!", "generalsorders-lecade-4-1-3", false);
        addSound("[2/3] Lecade: I mean, you have shown you are an extremely capable soldier! In fact, so capable, that I think you're ready for this next task.", "generalsorders-lecade-4-2-3", false);
        addSound("[3/3] Lecade: I want you to walk across a tightrope to amuse your fellow soldiers. The coordinates are in your quest book, so go put on a show!", "generalsorders-lecade-4-3-3", false);
        addSound("[1/1] Private: I'll bet you five emeralds they don't make it across.", "generalsorders-private-1-1", false);
        addSound("[1/3] Lecade: Wait, you actually went and did it? I didn't think anyone would do something so completely ridiculous!", "generalsorders-lecade-5-1-3", false);
        addSound("[2/3] Lecade: Fine, if you're still so eager to help after all of this, then I'll give you one last task to do.", "generalsorders-lecade-5-2-3", false);
        addSound("[3/3] Lecade: I need you to destroy a wall in the fort so we can  add another house. Lieutenant Gren is there to give you the details.", "generalsorders-lecade-5-3-3", false);
        addSound("[1/3] Gren: Stay away from this area! It's marked for demolition, we're just waiting for a soldier General Lecade sent in to do the job.", "generalsorders-gren-1-3", false);
        addSound("[2/3] Gren: Wait, you're supposed to be the one handling explosives? Well, better than me risking my own neck!", "generalsorders-gren-2-3", false);
        addSound("[3/3] Gren: In that case, just go light the explosives, and get back before you get blown to bits!", "generalsorders-gren-3-3", false);
        addSound("[1/7] ???: You were sent here under the orders of General Lecade? Seems that fool forgot he locked me up in here. Listen, that man can't be who he says he is, because...", "generalsorders-lecade-6-1-7", false);
        addSound("[2/7] ???: I am General Lecade.", "generalsorders-lecade-6-2-7", false);
        addSound("[3/7] Lecade: I know that sounds preposterous. The man you spoke to looks exactly like me, doesn't he? Well, let me explain everything I know about that impostor.", "generalsorders-lecade-6-3-7", false);
        addSound("[4/7] Lecade: It is actually a rare Gavel creature called \"Corpus Accipientis\" or in layman's terms, a shape-shifter. It took my identity and locked me up in this cell.", "generalsorders-lecade-6-4-7", false);
        addSound("[5/7] Lecade: That thing loves to create mischief, it lives to make others' lives harder. It must be doing horrible things to my loyal men, that beast!", "generalsorders-lecade-6-5-7", false);
        addSound("[6/7] Lecade: I want you to kill it. I know a way into my office, or its office now, from here. After all, I'm the one who had this place built.", "generalsorders-lecade-6-6-7", false);
        addSound("[7/7] Lecade: Hold down both wooden plates on the desks over there and a secret door should open. I'd follow you, but I am unable to leave this cell.", "generalsorders-lecade-6-7-7", false);
        addSound("[1/3] Corpus Accipientis: So, looks like you've found me out. You know, all I wanted to do was control an army, I wasn't even going to kill anyone!", "generalsorders-corpusaccipientis-1-3", true);
        addSound("[2/3] Corpus Accipientis: But you have to come in and ruin this, don't you? Such a shame, I was going to ask if I could borrow your form for a while.", "generalsorders-corpusaccipientis-2-3", true);
        addSound("[3/3] Corpus Accipientis: You know, defeating you will allow me to take your form and continue posing as the General. Yes, I'll use my true form to take you out!", "generalsorders-corpusaccipientis-3-3", true);
        addSound("[1/1] Lecade: Fear not, soldier! I am no slimy impostor, now bring me that shape-shifter's remains so I can lock them up!", "generalsorders-lecade-7-1-1", true);
        addSound("[1/5] Lecade: Well, looks like you destroyed a big blob of slime and came back without a scratch. Now that's what I like to see.", "generalsorders-lecade-8-1-5", false);
        addSound("[2/5] Lecade: I'm surprised you pulled that off, though. When I hunted that thing down, it managed to take my form. Guess I can learn a few tricks from you", "generalsorders-lecade-8-2-5", false);
        addSound("[3/5] Lecade: Well, at least that shape-shifter won't be taking anyone's body anymore. That thing already caused enough trouble when it only took mine, imagine if it took more.", "generalsorders-lecade-8-3-5", false);
        addSound("[5/5] Lecade: But enough of that, you helped out a tremendous deal. And for that you deserve a reward.", "generalsorders-lecade-8-5-5", false);


    }


    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(ModCore.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }

    private void addSound(String message, String name, boolean movingSound) {
        message = formatToSound(message);
        sounds.put(message, new CustomSoundClass(registerSound(name), movingSound));
    }

    public static String formatToSound(String message) {
        message = message.replaceAll(" ", "");
      //  message = message.replaceAll("’", "");
       // message = message.replaceAll("\\.", "");
      //  message = message.replaceAll(",", "");
        message = message.toLowerCase();

        message = getTextAfterSplit(message, "clearedallpotioneffects");
        message = getTextAfterSplit(message, "yourquestswillnotauto-trackanymore");
        message = getTextBeforeSplit(message, "pressshifttocontinue");
        message = getTextBeforeSplit(message, "presssneaktocontinue");
        message = getTextAfterSplit(message, "\\[");
        message = "[" + message;
        message = message.replace("\n", "");
        message = message.replaceAll("[^abcdefghijklmnopqrstuvwxyz?!0123456789/]", "");

        return message;
    }

    public static String getTextAfterSplit(String message, String split) {
        String[] splitMessage = message.split(split);
        message = splitMessage[splitMessage.length - 1];
        return message;
    }

    public static String getTextBeforeSplit(String message, String split) {
        String[] splitMessage = message.split(split);
        message = splitMessage[0];
        return message;
    }


}
