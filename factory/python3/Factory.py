from abc import ABCMeta, abstractmethod
from StructureBridgeImpl import StructureBridgeImpl
from StructureBuildImpl import StructureBuildImpl
from StructureHouseImpl import StructureHouseImpl

class Factory(object):
    def planBuilding(self, platform):
        print('Getting materials to start building a {0}'.format(platform))
        eval('Structure{}Impl'.format(platform))().getMaterials(None)
        print('Start building a {0}'.format(platform))
        eval('Structure{}Impl'.format(platform))().initBuilding()
        return "Finalized plan building of a {}".format(platform)
    
    def planStop(self, platform):
        eval('Structure{}Impl'.format(platform))().stopBuilding()
    

factoryObject = Factory()
# This will be an environment variable at the time of installation for construction companies.
PFORMS = ['House','Bridge','Build']
for platform in PFORMS:
	factoryObject.planBuilding(platform)
print("Stop the construction a House? Yes || No")
option = input()
if ("Yes" == option):
    factoryObject.planStop('House')