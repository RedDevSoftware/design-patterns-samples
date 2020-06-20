from abc import ABCMeta, abstractmethod
from StructureBridgeImpl import StructureBridgeImpl
from StructureBuildImpl import StructureBuildImpl
from StructureHouseImpl import StructureHouseImpl

class Factory(object):
    def planBuilding(self, platform_object):
        print('Getting materials to start building a {0}'.format(platform))
        eval('Structure{}Impl'.format(platform))().getMaterials(None)
        print('Start building a {0}'.format(platform))
        eval('Structure{}Impl'.format(platform))().initBuilding()
        return "Finalized plan building of a {}".format(platform)
    

factoryObject = Factory()
PFORMS = ['House','Bridge','Build']
for platform in PFORMS:
	factoryObject.planBuilding(platform)