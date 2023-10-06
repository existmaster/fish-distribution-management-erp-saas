
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderDeliveryManagementOrderManager from "./components/listers/OrderDeliveryManagementOrderCards"
import OrderDeliveryManagementOrderDetail from "./components/listers/OrderDeliveryManagementOrderDetail"
import OrderDeliveryManagementDeliveryManager from "./components/listers/OrderDeliveryManagementDeliveryCards"
import OrderDeliveryManagementDeliveryDetail from "./components/listers/OrderDeliveryManagementDeliveryDetail"

import ProductInventoryManagementProductManager from "./components/listers/ProductInventoryManagementProductCards"
import ProductInventoryManagementProductDetail from "./components/listers/ProductInventoryManagementProductDetail"
import ProductInventoryManagementInventoryManager from "./components/listers/ProductInventoryManagementInventoryCards"
import ProductInventoryManagementInventoryDetail from "./components/listers/ProductInventoryManagementInventoryDetail"

import TransportSupplyManagementSupplierManager from "./components/listers/TransportSupplyManagementSupplierCards"
import TransportSupplyManagementSupplierDetail from "./components/listers/TransportSupplyManagementSupplierDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderDeliveryManagements/orders',
                name: 'OrderDeliveryManagementOrderManager',
                component: OrderDeliveryManagementOrderManager
            },
            {
                path: '/orderDeliveryManagements/orders/:id',
                name: 'OrderDeliveryManagementOrderDetail',
                component: OrderDeliveryManagementOrderDetail
            },
            {
                path: '/orderDeliveryManagements/deliveries',
                name: 'OrderDeliveryManagementDeliveryManager',
                component: OrderDeliveryManagementDeliveryManager
            },
            {
                path: '/orderDeliveryManagements/deliveries/:id',
                name: 'OrderDeliveryManagementDeliveryDetail',
                component: OrderDeliveryManagementDeliveryDetail
            },

            {
                path: '/productInventoryManagements/products',
                name: 'ProductInventoryManagementProductManager',
                component: ProductInventoryManagementProductManager
            },
            {
                path: '/productInventoryManagements/products/:id',
                name: 'ProductInventoryManagementProductDetail',
                component: ProductInventoryManagementProductDetail
            },
            {
                path: '/productInventoryManagements/inventories',
                name: 'ProductInventoryManagementInventoryManager',
                component: ProductInventoryManagementInventoryManager
            },
            {
                path: '/productInventoryManagements/inventories/:id',
                name: 'ProductInventoryManagementInventoryDetail',
                component: ProductInventoryManagementInventoryDetail
            },

            {
                path: '/transportSupplyManagements/suppliers',
                name: 'TransportSupplyManagementSupplierManager',
                component: TransportSupplyManagementSupplierManager
            },
            {
                path: '/transportSupplyManagements/suppliers/:id',
                name: 'TransportSupplyManagementSupplierDetail',
                component: TransportSupplyManagementSupplierDetail
            },



    ]
})
