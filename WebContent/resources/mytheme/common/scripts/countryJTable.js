/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#CountryTableContainer').jtable({
		title : 'Countries',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'CountryCode DESC', // Set default sorting
		actions : {
			
				listAction : '/DrugIndex/admin/datatable/getAllCountryTableContainer',
				createAction : '/DrugIndex/admin/datatable/addCountryTableContainer',
				updateAction : '/DrugIndex/admin/datatable/updateCountryTableContainer',
				deleteAction : '/DrugIndex/admin/datatable/deleteCountryTableContainer'
		},
		fields : {
			CountryId: {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			CountryCode : {
				title : 'Country Code',
				width : '10%'
			},
			CountryName : {
				title : 'Country Name',
				width : '30%'
			}
			,
			CountrySymbol: {
				title : 'Country Symbol',
				width : '10%'
			}
			,
			CurrencyName: {
				title : 'Currency Name',
				width : '30%'
			}
			
			,
			CurrencySymbol: {
				title : 'Currency Symbol',
				width : '10%'
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
	$('#CountryTableContainer').jtable('load');

});
