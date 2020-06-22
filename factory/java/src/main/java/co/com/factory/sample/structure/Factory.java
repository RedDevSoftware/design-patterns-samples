package co.com.factory.sample.structure;

import co.com.factory.sample.constans.Constans;
import co.com.factory.sample.structure.impl.StructureBridgeImpl;
import co.com.factory.sample.structure.impl.StructureBuildImpl;
import co.com.factory.sample.structure.impl.StructureHouseImpl;
import co.com.factory.sample.utils.GenericUtils;

public class Factory {

    private static String MSG_GET_MATERIAL = "Getting materials to start building a %s";
    private static String MSG_INIT = "Start building a %s";

    public static void planBuilding(String platform) {
        GenericUtils.infoLogger(String.format(MSG_GET_MATERIAL, platform));

        if (platform != null && platform.equals(Constans.BRIDGE)){
            new StructureBridgeImpl().getMaterials();
            GenericUtils.infoLogger(String.format(MSG_INIT, platform));
            new StructureBridgeImpl().initBuilding();
        }
        if (platform != null && platform.equals(Constans.BUILD)){
            new StructureBuildImpl().getMaterials();
            GenericUtils.infoLogger(String.format(MSG_INIT, platform));
            new StructureBuildImpl().initBuilding();
        }
        if (platform != null && platform.equals(Constans.HOUSE)){
            new StructureHouseImpl().getMaterials();
            GenericUtils.infoLogger(String.format(MSG_INIT, platform));
            new StructureHouseImpl().initBuilding();
        }

    }

    public static void planStop(String platform){
        if (platform != null && platform.equals(Constans.BRIDGE)){
            new StructureBridgeImpl().stopBuilding();
        }
        if (platform != null && platform.equals(Constans.BUILD)){
            new StructureBuildImpl().stopBuilding();
        }
        if (platform != null && platform.equals(Constans.HOUSE)){
            new StructureHouseImpl().stopBuilding();
        }
    }
}
