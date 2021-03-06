package ua.od.game.model;

import java.util.List;
import java.util.Map;

/**@author Mazovskiy Mihail
 **/

public class CardEntity {

    private Integer id;
    private Integer cardId;
    private Integer groupId;
    private String name;
    private String description;
    private Map<Integer, Float> p1Buildings;
    private Map<Integer, Float> p2Buildings;
    private Map<Integer, Float> p1Resources;
    private Map<Integer, Float> p2Resources;
    private Map<Integer, Float> p1Upgrades;
    private Map<Integer, Float> p2Upgrades;
    private Map<Integer, Float> necessaryBuildings;
    private Map<Integer, Float> necessaryUpgrades;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<Integer, Float> getP1Buildings() {
        return p1Buildings;
    }

    public void setP1Buildings(Map<Integer, Float> p1Buildings) {
        this.p1Buildings = p1Buildings;
    }

    public Map<Integer, Float> getP2Buildings() {
        return p2Buildings;
    }

    public void setP2Buildings(Map<Integer, Float> p2Buildings) {
        this.p2Buildings = p2Buildings;
    }

    public Map<Integer, Float> getP1Resources() {
        return p1Resources;
    }

    public void setP1Resources(Map<Integer, Float> p1Resources) {
        this.p1Resources = p1Resources;
    }

    public Map<Integer, Float> getP2Resources() {
        return p2Resources;
    }

    public void setP2Resources(Map<Integer, Float> p2Resources) {
        this.p2Resources = p2Resources;
    }

    public Map<Integer, Float> getP1Upgrades() {
        return p1Upgrades;
    }

    public void setP1Upgrades(Map<Integer, Float> p1Upgrades) {
        this.p1Upgrades = p1Upgrades;
    }

    public Map<Integer, Float> getP2Upgrades() {
        return p2Upgrades;
    }

    public void setP2Upgrades(Map<Integer, Float> p2Upgrades) {
        this.p2Upgrades = p2Upgrades;
    }

    public Map<Integer, Float> getNecessaryBuildings() {
        return necessaryBuildings;
    }

    public void setNecessaryBuildings(Map<Integer, Float> necessaryBuildings) {
        this.necessaryBuildings = necessaryBuildings;
    }

    public Map<Integer, Float> getNecessaryUpgrades() {
        return necessaryUpgrades;
    }

    public void setNecessaryUpgrades(Map<Integer, Float> necessaryUpgrades) {
        this.necessaryUpgrades = necessaryUpgrades;
    }
}