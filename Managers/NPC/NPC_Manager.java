package net.perforce.jayapi.Managers.NPC;

import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.perforce.jayapi.Managers.NPC.Utils.*;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Set;


/** @ClassType Manager Class */
/** @ClassInfo Manages NPCs */

public class NPC_Manager {


    /** --------------------------------------------------------------------------------- */
    /** @VariableType   HashMap<EntityPlayer, Location> Variable                          */
    /** @VariableInfo   HashMap containing all the NPCs and their corresponding Locations */
    /** --------------------------------------------------------------------------------- */
    /**                                                                                   */
    public static HashMap<EntityPlayer, Location> NPCs = new HashMap<>();
    /**                                                                                   */
    /** --------------------------------------------------------------------------------- */


    /** -------------------------------------------------------------------------- */
    /** @VariableType   HashMap<Player, Set<EntityPlayer>> Variable                */
    /** @VariableInfo   HashMap containing all the Players with their linked NPCs  */
    /** -------------------------------------------------------------------------- */
    /**                                                                            */
    public static HashMap<Player, Set<EntityPlayer>> linkedNPCs = new HashMap<>();
    /**                                                                            */
    /** -------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                                              */
    /** @UtilInfo       Creates an NPC with given data                                                         */
    /** @ParameterInfo  • location: Location of the NPC                                                        */
    /**                 • skinPlayer: OfflinePlayer whose skin is used for the NPC                             */
    /**                 • name: Name of the NPC                                                                */
    /**                 • linkedPlayer: Player who the NPC is linked to                                        */
    /** ------------------------------------------------------------------------------------------------------ */
    /**                                                                                                        */
    public void createNPC(Location location, OfflinePlayer skinPlayer, String name) {
        createNPC.createNPC(location, skinPlayer, name);
    }
    /**                                                                                                        */
    public void createNPC(Location location, OfflinePlayer skinPlayer, String name, Player linkedPlayer) {
        createNPC.createNPC(location, skinPlayer, name, linkedPlayer);
    }
    /**                                                                                                        */
    /** ------------------------------------------------------------------------------------------------------ */


    /** ---------------------------------------------------------------------------------- */
    /** @UtilType       Location Util                                                      */
    /** @UtilInfo       Returns an NPC's Location                                          */
    /** @ParameterInfo  • npc: EntityPlayer to get the location of                         */
    /** ---------------------------------------------------------------------------------- */
    /**                                                                                    */
    public Location getLocation(EntityPlayer npc) {
        return getLocation.getLocation(npc);
    }
    /**                                                                                    */
    /** ---------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------- */
    /** @UtilType       Set<EntityPlayer> Util                                          */
    /** @UtilInfo       Returns a list of all NPCs                                      */
    /** @ParameterInfo  • player: Player to get the linked NPCs of                      */
    /** ------------------------------------------------------------------------------- */
    /**                                                                                 */
    public Set<EntityPlayer> getNPCs() {
        return getNPCs.getNPCs();
    }
    /**                                                                                 */
    public Set<EntityPlayer> getNPCs(Player player) {
        return getNPCs.getNPCs(player);
    }
    /**                                                                                 */
    /** ------------------------------------------------------------------------------- */


    /** -------------------------------------------------------------- */
    /** @UtilType       Void Util                                      */
    /** @UtilInfo       Hides all NPCs for a Player                    */
    /** @ParameterInfo  • player: Player to hide the NPCs from         */
    /** -------------------------------------------------------------- */
    /**                                                                */
    public void hideNPCs(Player player) {
        hideNPCs.hideNPCs(player);
    }
    /**                                                                */
    /** -------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                           */
    /** @UtilInfo       Removes one or more linked NPCs for a Player                                        */
    /** @ParameterInfo  • player: Player to remove the NPC(s) for                                           */
    /**                 • npc(s): NPC(s) to remove                                                          */
    /** --------------------------------------------------------------------------------------------------- */
    /**                                                                                                     */
    public void removeNPC(Player player, EntityPlayer npc) {
        removeNPCs.removeNPC(player, npc);
    }
    /**                                                                                                     */
    public void removeNPCs(Player player, List<EntityPlayer> npcs) {
        removeNPCs.removeNPCs(player, npcs);
    }
    /**                                                                                                     */
    /** --------------------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------- */
    /** @UtilType       Void Util                                             */
    /** @UtilInfo       Shows all NPCs in the same World to a Player          */
    /** @ParameterInfo  • player: Player to show the NPCs to                  */
    /** --------------------------------------------------------------------- */
    /**                                                                       */
    public static void showNPCs(Player player) {
        showNPCs.showNPCs(player);
    }
    /**                                                                       */
    /** --------------------------------------------------------------------- */


}
