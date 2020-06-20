from abc import ABCMeta, abstractmethod

class IStructureFactory(metaclass=ABCMeta):
    @abstractmethod
    def getMaterials(self, object):
        raise NotImplementedError('Oh! an error has occurred please implement <getMaterials>!')
    
    @abstractmethod
    def initBuilding(self):
        raise NotImplementedError('Oh! an error has occurred please implement <initBuilding>!')
    
    @abstractmethod
    def stopBuilding(self, object):
        raise NotImplementedError('Oh! an error has occurred please implement <stopBuilding>!')
