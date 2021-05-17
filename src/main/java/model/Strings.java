package model;

public enum Strings {

    CARD_NOT_EXIST_IN_HAND_SET("you can’t set this card"),
    CANNOT_ACTIVATE_IN_THIS_TURN("you can’t activate an effect on this turn"),
    CARD_NOT_EXIST_IN_HAND_SUMMON("you can’t summon this card"),
    TRIBUTE_ONE_CARD("tribute one card"),
    TRIBUTE_TWO_CARD("tribute two cards"),
    ACTIVATION_IS_ONLY_FOR_SPELLS("activate effect is only for spell cards."),
    CARD_IS_NOT_VISIBLE("card is not visible"),
    CANNOT_FLIP_SUMMON_THIS_CARD("you can’t flip summon this card"),
    CANNOT_SUMMON_THIS_CARD("you can’t summon this card"),
    NOT_ENOUGH_CARDS_FOR_TRIBUTE("there are not enough cards for tribute"),
    NO_MONSTERS_ON_THIS_ADDRESS_ONE_TRIBUTE("there no monsters one this address"),
    NO_MONSTERS_ON_THIS_ADDRESS_TWO_TRIBUTE("there is no monster on one of these addresses"),
    POSITION_CHANGED_SUCCESSFULLY("monster card position changed successfully"),
    POSITION_ALREADY_CHANGED("you already changed this card position in this turn"),
    PHASE_PRINT("phase: %s"),
    CHANGE_TURN_PRINT("phase: %s\nits %s’s turn%s"),
    NEW_CARD_ADDED_TO_HAND("\nnew card added to the hand : %s"),
    ATTACK_OPTION("attack"),
    WINNER("%s won the game and the score is: %d-%d"),
    ALREADY_SUMMONED("you already summoned/set on this turn"),
    NO_CARD_TO_ATTACK("there is no card to attack here"),
    CARD_NOT_VISIBLE("there is no card to attack here"),
    ALREADY_ATTACKER("this card already attacked"),
    ALREADY_ACTIVATED("you have already activated this card"),
    SET_SUCCESSFULLY("set successfully"),
    SUMMON_SUCCESSFULLY("summoned successfully"),
    CANNOT_TAKE_ACTION_IN_THIS_PHASE("you can’t do this action in this phase"),
    CARD_NOT_EXIST_IN_MONSTER_ZONE("you can’t change this card position"),
    CANNOT_CHANGE_POSITION("you can’t change this card position"),
    CANNOT_ATTACK_WITH_THIS_CARD("you can’t attack with this card"),
    ACTION_NOT_ALlOWED_IN_THIS_PHASE("action not allowed in this phase"),
    MONSTER_ZONE_FULL("monster card zone is full"),
    SPELL_ZONE_FULL("spell card zone is full"),
    ALREADY_POSITIONED("this card is already in the wanted position"),
    INVALID_SELECTION("invalid selection"),
    MONSTER_POSITION("monster"),
    MONSTER_POSITION_CHANGED("monster position changed successfully"),
    HAND_POSITION("hand"),
    SPELL_POSITION("spell"),
    TO("to"),
    CARD_SELECTED("card selected"),
    CARD_DESELECTED("card deselected"),
    OPPONENT_OPTION("opponent"),
    NO_CARD_FOUND("no card found in the given position"),
    AREA("area"),
    POSITION("position"),

    OO_ATTACK_MORE("your opponent's monster is destroyed and your opponent receives %d battle damage"),
    OO_ATTACK_LESS("your monster card is destroyed and you received %d battle damage"),
    OO_ATTACK_EQUAL("both you and your opponent monster cards are destroyed and one receives damage"),
    DO_ATTACK_MORE("no card is destroyed and you received %d battle damage"),
    DO_ATTACK_LESS("the defense position monster is destroyed"),
    DO_ATTACK_EQUAL("no card is destroyed"),
    DH_ATTACK_EQUAL("opponents monster card was %s and "),
    DIRECT_ATTACK("you opponent receives %d battle damage"),
    SIDE("side"),
    COMMAND("command"),
    MAIN("main"),
    MAIN_DECK("main"),
    DECK("deck"),
    DECK_NAME("deck-name"),
    CARD("card"),
    OPTION("option"),
    ROUNDS_NUMBER("rounds"),
    TOKEN("token"),
    SECOND_PLAYER("second-player"),
    CARD_PRINT_FORMAT("%s : %s"),
    DECK_CARDS_PRINT_FORMAT("Deck: %s\n%s Deck:\nMonsters:%s\nSpells and Traps:%s"),
    DECK_PRINT_FORMAT("%s: main deck %d, side deck %d, %s"),
    DECKS_PRINT_FORMAT("Decks:\nَActive Deck:%s\nOther Decks:\n%s"),
    GRAVEYARD_PRINT_FORMAT("%d"),
    FIELD_ZONE_PRINT_FORMAT("%s"),
    PLAYING_DECK_PRINT_FORMAT("%d"),
    HAND_PRINT_FORMAT("\t%s\t%s\t%s\t%s\t%s\t%s"),
    SIDE_DECK("side"),
    VALID("valid"),
    INVALID("invalid"),
    START_DUEL("duel started between %s and %s"),
    INVALID_DECK("%s’s deck is invalid"),
    NO_ACTIVE_DECK("%s has no active deck"),
    PLAYER_NOT_EXIST("there is no player with this username"),
    SAME_SECOND_PLAYER("please enter another username except yours"),
    SIDE_OPTION("side"),
    NUMBER_OF_ROUNDS_NOT_SUPPORTED("number of rounds is not supported"),
    NEW_OPTION("new"),
    PLAYER_FORMAT("%s : %s"),
    ZONE_PRINT_FORMAT("\t%s\t%s\t%s\t%s\t%s\t"),
    COLOR_YELLOW_BOLD("\033[1;36m %s \033[0m"),
    BOARD_STRUCTURE("\n%s\n\t%s\n%s\n%s\n%s\n%s\t\t\t\t\t\t%s\n\n--------------------------\n\n%s\t\t\t\t\t\t%s\n%s\n%s\n\t\t\t\t\t\t%s\n%s\n%s");


    public final String label;

    Strings(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
