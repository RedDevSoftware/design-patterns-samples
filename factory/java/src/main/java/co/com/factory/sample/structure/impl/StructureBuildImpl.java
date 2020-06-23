package co.com.factory.sample.structure.impl;

import co.com.factory.sample.constans.Constans;
import co.com.factory.sample.structure.IStructureFactory;
import co.com.factory.sample.utils.GenericUtils;

public class StructureBuildImpl implements IStructureFactory {

    private String[] materials = {"Material ZX","Material ZF","Material ZT"};

    @Override
    public void getMaterials() {
        for (String material : materials) {
            GenericUtils.infoLogger(String.format("Need %s of %s to start a %s.",
                    (int) (Math.random()*100), material, Constans.BUILD));
        }
        GenericUtils.infoLogger("-------------------------------------");
    }

    @Override
    public void initBuilding() {
        GenericUtils.infoLogger("This is plan to building...");
        for (int plan = 1; plan <= 5; plan++){
            GenericUtils.infoLogger(String.format("Step %s in %s minutes.", plan, (int) (Math.random()*100)));
        }
        GenericUtils.infoLogger("-------------------------------------");
    }

    @Override
    public void stopBuilding() {
        GenericUtils.infoLogger("Init stopBuilding in StructureBuildImpl");
    }
}
