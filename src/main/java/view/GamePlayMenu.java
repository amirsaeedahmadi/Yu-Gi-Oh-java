package view;

import model.Strings;
import view.enums.CommandTags;
import view.enums.Menus;
import view.enums.Regexes;
import view.enums.Responses;

public class GamePlayMenu extends Menu{


    public void run() {

        while (!(command = Console.scan()).equals(Regexes.MENU_EXIT.getLabel())) {
            setCurrentMenu(Menus.GAMEPLAY_MENU);
            if (command.matches(Regexes.MENU_ENTER.getLabel()))                           // enter other menus
                Console.print(Responses.IMPOSSIBLE_MENU_NAVIGATION.getLabel());
            else if (command.matches(Regexes.MENU_CURRENT.getLabel()))                    // show current menu
                Console.print(currentMenu);
            else if (command.matches(Regexes.SHOW_SELECTED_CARD.getLabel())){
                Request.setCommandTag(CommandTags.SHOW_SELECTED_CARD);
                Request.send();
                Console.print(Request.getMessage());
            }
            else if (command.matches(Regexes.SELECT.getLabel()) ||
                    command.matches(Regexes.SELECT_FIELD.getLabel())) {
                select();
                Console.printBoard(Request.getResponse());
                Console.print(Request.getMessage());
            }
            else if (command.matches(Regexes.NEXT_PHASE.getLabel())){
                Request.setCommandTag(CommandTags.NEXT_PHASE);
                Request.send();
                Console.printBoard(Request.getResponse());
            }
            else if (command.matches(Regexes.SUMMON.getLabel())) {            // summon cards

                Request.setCommandTag(CommandTags.SUMMON);
                Request.send();
                Console.printBoard(Request.getResponse());
                Console.print(Request.getMessage());

            } else if (command.matches(Regexes.SET.getLabel())) {            // summon cards
                System.out.println("setting the card");
                Request.setCommandTag(CommandTags.SET);
                Request.send();
                Console.printBoard(Request.getResponse());
                Console.print(Request.getMessage());
            } else if (command.matches(Regexes.SET_POSITION.getLabel())) {            // summon cards

                Request.setCommandTag(CommandTags.SET_POSITION);
                Request.extractData(command);
                Request.send();
                Console.print(Request.getMessage());
            } else if (command.matches(Regexes.ATTACK_TO.getLabel())) {            // summon cards
                Request.setCommandTag(CommandTags.ATTACK);
                Request.addDataToRequest(Regexes.ATTACK_TO.getLabel(), command, Strings.TO.getLabel());
                Request.send();
                Console.printBoard(Request.getResponse());
                Console.print(Request.getMessage());
            }else Console.print(Responses.INVALID_COMMAND.getLabel()); // invalid command



        }

    }

    private void select() {

        Request.setCommandTag(CommandTags.SELECT);
        Request.setOption(command, Strings.OPPONENT_OPTION.getLabel());

        if (command.matches(Regexes.SELECT_FIELD.getLabel())){
            Request.addData("area", "field");
        }else{
            Request.addDataToRequest(Regexes.SELECT_AREA.getLabel(), command, "area");
            Request.addDataToRequest(Regexes.SELECT_POSITION.getLabel(), command, "position");
        }

        Request.send();


        // select --filed
        // select --filed --opponent
        // select --monster n
        // select --monster n --opponent
        // select --spell n
        // select --spell n --opponent
        // select --hand n

    }
}
