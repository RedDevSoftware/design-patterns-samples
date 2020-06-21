import random
import time
from abc import ABCMeta, abstractmethod
from IStructureFactory import IStructureFactory

class StructureBridgeImpl(IStructureFactory):
	__materials = ['Material PL','Material PY','Material PK']

	def getMaterials(self, object):
		for material in self.__materials:
			print("Need {0} of {1} to start a house.".format(random.randint(1,101), material))
		print("-------------------------------------")

	def initBuilding(self):
		print("This is plan to building...")
		for plan in range(5):
			print("Step {0} in {1} minutes.".format(plan, random.randint(1,101)))
		print("-------------------------------------")

	def stopBuilding(self):
		print("Init stopBuilding in StructureBridgeImpl")