/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#DrugFormulationTableContainer').jtable({
		title : 'Drug  Formulation',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'PrensationCode DESC', // Set default sorting
		actions : {
			
				listAction : '/DrugIndex/admin/datatable/getAllDrugFormulationTableContainer',
				createAction : '/DrugIndex/admin/datatable/addDrugFormulationTableContainer',
				updateAction : '/DrugIndex/admin/datatable/updateDrugFormulationTableContainer',
				deleteAction : '/DrugIndex/admin/datatable/deleteDrugFormulationTableContainer'
		},
		fields : {
			DrugFormulationId: {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			PrensationCode : {
				title : 'Prensation Code',
				width : '10%'
			},
			TypeName : {
				title : 'Type Name',
				width : '20%'
			}
			,
			TypeName : {
				title : 'Strength Type',
				width : '20%'
			}
			

		}
	/*
	 * //Register to selectionChanged event to hanlde events recordAdded:
	 * function(event, data){ //after record insertion, reload the records
	 * $('#ExpenseTableContainer').jtable('load'); }, recordUpdated:
	 * function(event, data){ //after record updation, reload the records
	 * $('#ExpenseTableContainer').jtable('load'); }
	 */
	});
	$('#DrugFormulationTableContainer').jtable('load');

});
